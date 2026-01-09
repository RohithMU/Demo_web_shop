package utils;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver initDriver() {
        loadProperties();

        String browser = prop.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        return driver;
    }

    public static void loadProperties() {
        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(
                "src/test/resources/config/config.properties");
            prop.load(fis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }
}
