package md.automation.Sites;


    import md.automation.webdriver.WebDriverConfig;
    import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

    public class FoodHouse extends WebDriverConfig {

        @Test
        public void FirstTest() {
            driver.get("https://foodhouse.md/");

            String title = driver.getTitle();
            Assert.assertTrue(title.equals("Доставка еды из ресторанов в Кишиневе | FOODHOUSE"));
        }


    }


