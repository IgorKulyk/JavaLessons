package Lesson29;


import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Forest forest = new Forest();
        Camp camp = new Camp(10000);
        Semaphore sem = new Semaphore(3);
        Thread thread1 = new Thread(new Worker("Tilly", forest, camp, sem));
        Thread thread2 = new Thread(new Worker("Willy", forest, camp, sem));
        Thread thread3 = new Thread(new Worker("Dilly", forest, camp, sem));
        Thread thread4 = new Thread(new Worker("Billy", forest, camp, sem));
        Thread thread5 = new Thread(new Worker("Zilly", forest, camp, sem));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        System.out.println("----------------------");
        camp.willTheCampSurvive();
    }
}

class Worker implements Runnable {
    private String name;
    private int wood;//in pockets
    private Forest forest;
    private Camp camp;
    private Semaphore sem;
    private int countOfAttempts;
    private Random random;

    public Worker(String name, Forest forest, Camp camp, Semaphore sem) {
        this.name = name;
        this.wood = 0;
        this.forest = forest;
        this.camp = camp;
        this.sem = sem;
        this.countOfAttempts = 5;
        random = new Random();
    }

    @Override
    public void run() {
        System.out.println(name + ": Ready to work...");

        while (countOfAttempts >= 0) {
            try {
                System.out.println(name + "Waiting to enter the forest");
                sem.acquire();
                System.out.println(name + "Entered the forest");
                forest.goToForest();
                wood = random.nextInt(500) + 100;
                System.out.println(name + ": I have now :" + wood + " wood");
                System.out.println(name + " : I go to camp");
                wood -= camp.getWoodFromWorker(wood);
                System.out.println("In camp now : " + camp.getWood());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + "Leaves the forest");
            sem.release();
            countOfAttempts--;
            wood -= camp.getWoodFromWorker(wood);
            System.out.println("In camp now : " + camp.getWood());

        }
    }
}

class Camp {
    private int reqWood;
    private int wood;
    private Random random;


    Camp(int reqWood) {
        this.wood = 0;
        this.reqWood = reqWood;
        random = new Random();
    }

    public int getWood() {
        return wood;
    }

    public int getWoodFromWorker(int x) {
        this.wood += x;
        try {
            Thread.sleep((random.nextInt(5) + 1) * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return x;
    }

    public void willTheCampSurvive() {
        System.out.println("Required wood = " + reqWood);
        System.out.println("You collected " + wood + " wood");
        if (wood >= reqWood) {
            System.out.println("Camp will survive the attack");
        } else
            System.out.println("Camp destroyed");
    }
}


class Forest {
    private Random random;

    public Forest() {
        random = new Random();
    }

    public Forest(Random random) {
        this.random = random;
    }

    public void goToForest() {
        try {
            Thread.sleep((random.nextInt(5) + 1) * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
