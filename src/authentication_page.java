package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class authentication_page {
    WebDriver driver;
    By emailCreate = By.xpath("//*[@id=\"email_create\"]");
    By submitcreate = By.xpath("//*[@id=\"SubmitCreate\"]/span");


    public authentication_page(WebDriver driver){

        this.driver = driver;

    }
    public void setemailCreate(String strEmail){

        driver.findElement(emailCreate).sendKeys(strEmail);

    }
    public void setSubmitcreate()
    {driver.findelement}
}
