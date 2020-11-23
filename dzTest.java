package DZExample;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dzTest {
    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://google.com");
    }

    @Test
    public void closeSelenium() {
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}

