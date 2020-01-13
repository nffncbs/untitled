package pages;

import com.sun.org.apache.xpath.internal.objects.XString;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage {
    WebDriver driver;
    By emailField = By.xpath("//*[@id=\"email_create\"]");
    By submitCreate = By.xpath("//*[@id=\"SubmitCreate\"]/span");
    By gender = By.xpath("//*[@id=\"id_gender1\"]");
    By firstName = By.xpath("//*[@id=\"customer_firstname\"]");
    By lastName = By.xpath("//*[@id=\"customer_lastname\"]");
    By password = By.xpath("//*[@id=\"passwd\"]");
    By address = By.xpath("//*[@id=\"address1\"]");
    By city = By.xpath("//*[@id=\"city\"]");
    By zipcode = By.xpath("//*[@id=\"postcode\"]");
    By phoneNumber = By.xpath("//*[@id=\"phone_mobile\"]");
    By state = By.xpath("//*[@id=\"id_state\"]");
    By country = By.xpath("//*[@id=\"id_state\"]");
    By submitAccount = By.xpath("//*[@id=\"submitAccount\"]");
    By createAccountError = By.xpath("//*[@id=\"create_account_error\"]/ol/li");
    By other = By.xpath("//*[@id=\"other\"]");
    By rightLogIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span");


    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setEmailField(String strEmail) {
        driver.findElement(emailField).sendKeys(strEmail);
    }
    public void clickSubmitCreate() {
        driver.findElement(submitCreate).click();
    }
    public boolean isCreateAccountErrorDisplayed(){
        return driver.findElement(createAccountError).isDisplayed();
    }
    public void setGender(){
        driver.findElement(gender).click();
    }
    public void setFirstName(String strFirstName){
        driver.findElement(firstName).sendKeys(strFirstName);
    }
    public void setLastName(String strLastName) {
        driver.findElement(lastName).sendKeys(strLastName);
    }
    public void setPassword(String pswd){
        driver.findElement(password).sendKeys(pswd);
    }
    public void setAddress(String addressLine){
        driver.findElement(address).sendKeys(addressLine);
    }
    public void setCity(String cityName){
        driver.findElement(city).sendKeys(cityName);
    }
    public void setZipcode(String zipCodeNumbers){
     driver.findElement(zipcode).sendKeys(zipCodeNumbers);
    }
    public void setPhoneNumber(String phone){
        driver.findElement(phoneNumber).sendKeys(phone);
    }
    public void setState()
    {
        Select pickState  = new Select(driver.findElement(state));
        pickState.selectByVisibleText("Kansas");
    }
    public  void setCountry(){
        Select pickCountry  = new Select(driver.findElement(country));
        pickCountry.selectByVisibleText("United States");
        driver.findElement(country).sendKeys(Keys.ENTER);
    }
    public  void clickSubmitAccount(){
        driver.findElement(submitAccount).click();
    }
    public void waitUntilClickable(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(firstName));
    }
    public  void fillInOther(String info){
        driver.findElement(other).sendKeys(info);
    }
    public boolean isLogInRight() {
        return driver.findElement(rightLogIn).isDisplayed();
    }
}
