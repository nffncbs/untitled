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

public class successregister {
    WebDriver driver;

    @BeforeClass
    void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }

    @Test
    void goodemailtest()
    {
        By emailCreate = By.xpath("//*[@id=\"email_create\"]");
        driver.findElement(emailCreate).sendKeys("111@111.115");

        By submitcreate = By.xpath("//*[@id=\"SubmitCreate\"]/span");
        driver.findElement(submitcreate).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"customer_firstname\"]")));

        By genderpick = By.xpath("//*[@id=\"id_gender1\"]");
        driver.findElement(genderpick).click();

        By firstname = By.xpath("//*[@id=\"customer_firstname\"]");
        driver.findElement(firstname).sendKeys("Rusty");

        By lastname = By.xpath("//*[@id=\"customer_lastname\"]");
        driver.findElement(lastname).sendKeys("Shackleford");

        By password = By.xpath("//*[@id=\"passwd\"]");
        driver.findElement(password).sendKeys("111111");

        By address = By.xpath("//*[@id=\"address1\"]");
        driver.findElement(address).sendKeys("Camping Fridge Box");

        By city = By.xpath("//*[@id=\"city\"]");
        driver.findElement(city).sendKeys("Kansas City");

        By zipcode = By.xpath("//*[@id=\"postcode\"]");
        driver.findElement(zipcode).sendKeys("23433");

        By phonenumber = By.xpath("//*[@id=\"phone_mobile\"]");
        driver.findElement(phonenumber).sendKeys("2342342342");

        Select state  = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
        state.selectByVisibleText("Kansas");

        Select country  = new Select(driver.findElement(By.xpath("//*[@id=\"id_state\"]")));
        country.selectByVisibleText("United States");

        By submitButton = By.xpath("//*[@id=\"submitAccount\"]");
        driver.findElement(submitButton).click();

        driver.manage().timeouts().setScriptTimeout(2, TimeUnit.SECONDS);

        By registererror = By.xpath("//*[@id=\"center_column\"]/div");
        Assert.assertFalse(driver.findElement(registererror).isDisplayed());




    }


}