package Lesson9.TestMySQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestMySQL {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost/lib?serverTimezone=Israel&useSSL=false";
            String username = "root";
            String password = "1308";
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(url, username, password)) {

                System.out.println("Connected!!!");
            }
        } catch (Exception ex) {
            System.out.println("Connection failed...");
            System.out.println(ex);
        }
    }
}
