package Connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/myDb";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";

    public static void main(String[] args) {
        try {
            // Step 1: Load the database driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish the database connection
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            // Step 3: Perform database operations
            // ...

            // Step 4: Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load database driver.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to establish database connection.");
            e.printStackTrace();
        }
    }
}
