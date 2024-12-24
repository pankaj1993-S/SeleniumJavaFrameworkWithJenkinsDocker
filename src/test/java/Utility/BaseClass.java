package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    WebDriver driver; // Instance variable

    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        FileReader reader = new FileReader("E:\\Coding workspace\\com.selenium.java.project\\src\\test\\resources\\Properties\\Constant.properties");
        Properties props = new Properties();
        props.load(reader);
        driver.get(props.getProperty("URL"));
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
