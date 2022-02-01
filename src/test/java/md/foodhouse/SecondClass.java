package md.foodhouse;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SecondClass {

    public ChromeDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test Start");

    }

    @Test
    public void SecondTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(70, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://gurmand.md/wp-login.php");
        driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("Your-Email");
        driver.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("Your-Password");
        driver.findElement(By.xpath("//input[@id='rememberme']")).click();

    }


        @AfterTest
        public void close() {
            System.out.println("test close");
            driver.quit();
        }
    }




