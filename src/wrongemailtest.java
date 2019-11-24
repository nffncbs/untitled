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

public class wrongemailtest {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
       System.setProperty("webdriver.chrome.driver","C:/chromedriver/chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
    }
    @Test
    void wrongemailtest()
    {
        By emailCreate = By.xpath("//*[@id=\"email_create\"]");
        driver.findElement(emailCreate).sendKeys("wrong email");
        By submitcreate = By.xpath("//*[@id=\"SubmitCreate\"]/span");
        driver.findElement(submitcreate).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"create_account_error\"]/ol/li")));
        By createaccounterror = By.xpath("//*[@id=\"create_account_error\"]/ol/li");
        Assert.assertTrue(driver.findElement(createaccounterror).isDisplayed());
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}

