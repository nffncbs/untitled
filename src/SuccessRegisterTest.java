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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class successRegisterTest {
    WebDriver driver;
    pages.AuthenticationPage objAuth;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test(dataProvider="getData")
    void successRegisterTest(String EmailField, String FirstName, String LastName, String Password, String Address, String City, String Zipcode, String PhoneNumber, String State, String InOther)
    {
        objAuth = new pages.AuthenticationPage(driver);
        objAuth.setEmailField(EmailField);
        objAuth.clickSubmitCreate();

        objAuth.waitUntilClickable();

        objAuth.setGender();

        objAuth.setFirstName(FirstName);

        objAuth.setLastName(LastName);

        objAuth.setPassword(Password);

        objAuth.setAddress(Address);

        objAuth.setCity(City);

        objAuth.setZipcode(Zipcode);

        objAuth.setPhoneNumber(PhoneNumber);

        objAuth.setState(State);

  //      objAuth.setCountry();

        objAuth.fillInOther(InOther);

        objAuth.clickSubmitAccount();

        Assert.assertTrue(objAuth.isLogInRight());






    }
    public class User 
    @DataProvider
    public Object[][] getData()
    {
        //Rows - Number of times your test has to be repeated.
        //Columns - Number of parameters in test data.
        Object[][] data = new Object[1][10];

        // 1st row
        data[0][0] ="111@111.12223";
        data[0][1] = "Rusty";
        data[0][2] = "Shackleford";
        data[0][3] = "111111";
        data[0][4] = "Camping Fridge Box";
        data[0][5] = "Kansas City";
        data[0][6] = "23433";
        data[0][7] = "2342342342";
        data[0][8] = "Kansas";
        data[0][9] = "111";


        return data;
    }


}