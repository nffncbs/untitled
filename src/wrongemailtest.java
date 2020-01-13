import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WrongEmailTest {
    WebDriver driver;
    pages.AuthenticationPage objAuth;
    @BeforeClass
    void setup()
    {
       System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
       driver=new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
    @Test
    void wrongEmailTest()
    {
        objAuth = new pages.AuthenticationPage(driver);

        objAuth.setEmailField("wrong_email");

        objAuth.clickSubmitCreate();

        Assert.assertTrue(objAuth.isCreateAccountErrorDisplayed());

    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }

}

