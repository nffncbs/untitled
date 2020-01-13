import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SuccessRegisterTest {
    WebDriver driver;
    pages.AuthenticationPage objAuth;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    void successRegisterTest()
    {
        objAuth = new pages.AuthenticationPage(driver);
        objAuth.setEmailField("111@111.118");
        objAuth.clickSubmitCreate();

        objAuth.waitUntilClickable();

        objAuth.setGender();

        objAuth.setFirstName("Rusty");

        objAuth.setLastName("Shackleford");

        objAuth.setPassword("111111");

        objAuth.setAddress("Camping Fridge Box");

        objAuth.setCity("Kansas City");

        objAuth.setZipcode("23433");

        objAuth.setPhoneNumber("2342342342");

        objAuth.setState();

        objAuth.setCountry();

        objAuth.fillInOther("im gonna click it!");

        objAuth.clickSubmitAccount();






    }


}