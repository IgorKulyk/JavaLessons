package Lesson29.Task2New;


import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Toilet toilet = new Toilet();

        Thread bard1 = new Thread(new Bard(toilet, "Priscilla"));
        Thread bard2 = new Thread(new Bard(toilet, "Lutic"));
        Thread bard3 = new Thread(new Bard(toilet, "Red"));
        Thread bard4 = new Thread(new Bard(toilet, "Leliana"));

        bard1.start();
        bard2.start();
        bard3.start();
        bard4.start();

    }
}


class Bard implements Runnable {

    private Random random;
    private String name;
    private String[] song;
    private Toilet toilet;
    private SongGenerator songGenerator;

    public Bard(Toilet toilet, String name) {
        this.toilet = toilet;
        random = new Random();
        songGenerator = new SongGenerator();
        this.name = name;
        this.song = songGenerator.getRawsFromSong();

    }

    @Override
    public void run() {
        while (toilet.canWrite()) {
            String raw = song[random.nextInt(song.length)];
            //System.out.println(name + ": my raw is \n" + raw);
            toilet.writeYourFuckingRawOnFuckingToiletWall(raw);
            System.out.println("On toilet wall now: \n" + toilet.getSong());
        }
//        System.out.println(toilet.getSong());

    }
}

class Toilet {
    private String newSong;
    private int countOfRaws;

    public Toilet() {
        newSong = "";
        countOfRaws = 6;
    }

    public String getSong() {
        return newSong;
    }

    public synchronized String writeYourFuckingRawOnFuckingToiletWall(String raw) {
        try {
            Thread.sleep(500);
            newSong += raw;
            countOfRaws--;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return raw;
    }

    public boolean canWrite() {
        if (countOfRaws > 1) {
            return true;
        } else
            return false;
    }


}

class SongGenerator {
    private Random random = new Random();
    String[] song = {
            "Из снов моих с утра бежишь проворно\n",
            "Крыжовник терпкий Сладкая сирень\n",
            "Хочу во сне твой видеть локон черный\n",
            "Фиалки глаз твоих, Что слез туманит тень\n",
            "По следу волка Я пойду в метели\n",
            "И сердце дерзкое Настигну по утру\n",
            "Сквозь гнев и грусть, Что камнем затвердели\n",
            "Я разожгу уста, Что мерзнут на ветру\n"
    };

    String[] getRawsFromSong() {
        String res[] = new String[2];
        res[0] = song[random.nextInt(song.length)];
        res[1] = song[random.nextInt(song.length)];
        return res;
    }
}


