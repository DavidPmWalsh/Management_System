package config;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.io.InputStreamReader;

public class ConfigReader {
    private static final String CONFIG_FILE = "C:\\Users\\Dave\\secure\\config.properties";

    public static void main(String[] args) {
        Properties properties = new Properties();
        try (FileInputStream inputStream = new FileInputStream(CONFIG_FILE)) {
            properties.load(new InputStreamReader(inputStream, "UTF-8"));
            String username = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            // Use the retrieved credentials for database connection or other purposes
            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        } catch (IOException e) {
            System.out.println("Failed to load configuration file.");
            e.printStackTrace();
        }
    }
}