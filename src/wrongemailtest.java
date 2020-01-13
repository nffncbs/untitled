import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class wrongemailtest {
    WebDriver driver;
    pages.authentication_page objAuth;
    @BeforeClass
    void setup()
    {
       System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
    @Test
    void wrongemailtest()
    {
        objAuth = new pages.authentication_page(driver);

        objAuth.setemailCreate("wrong_email");


    }

}

