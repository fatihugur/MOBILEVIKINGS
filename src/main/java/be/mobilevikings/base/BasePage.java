package be.mobilevikings.base;

import be.mobilevikings.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;

    public static WebDriver initializeDriver() {
        ConfigReader.readProperties(Constants.CONFIGURATION_FILE);
        String browser = ConfigReader.getProperty("browser");
        String baseURL = ConfigReader.getProperty("url");
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid Browser");
                throw new RuntimeException("Invalid Browser name");
        }
        PageManager.initialize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
        driver.get(baseURL);
        return driver;
    }

    public static void tearDown() {
        if (driver != null) driver.quit();
    }
}