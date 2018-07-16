import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Ebay {
    public WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testEbay() {

        openEbay();
        loginEbay();
      

    }
    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }


    public void openEbay() {
        driver.get("https://www.ebay.com/");
    }

    public void loginEbay() {

        driver.findElement(By.id("gh-ug")).click();

        driver.findElement(By.id("userid")).click();
        driver.findElement(By.id("userid")).clear();
        driver.findElement(By.id("userid")).sendKeys("jfedotkina@yahoo.com");

        driver.findElement(By.id("pass")).click();
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys("Aviva001");

        if(!driver.findElement(By.id("csi")).isEnabled()) {
            driver.findElement(By.id("csi")).click();
        }

        driver.findElement(By.id("sgnBt")).click();


    }
}
