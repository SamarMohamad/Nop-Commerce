package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_RegistrationPage {
    WebDriver driver;
    public P02_RegistrationPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2Fpasswordrecovery");
    }

    public final By Gender_box = By.xpath("(//input)[3]");
    private final By FirstName_textbox = By.xpath("(//input)[5]");
    private final By LastName_textbox = By.xpath("(//input)[6]");
    private final By Email_textbox = By.xpath("(//input)[7]");
    private final By Password_textbox = By.xpath("(//input)[10]");
    private final By ConfirmPassword_textbox = By.xpath("(//input)[11]");
    private final By Register_Button = By.xpath("(//button)[2]");


    public P02_RegistrationPage SelectGender() {
        driver.findElement(this.Gender_box).click();
        return this;
    }

    public P02_RegistrationPage Enter_first_name(String firstName) {
        driver.findElement(this.FirstName_textbox).sendKeys(firstName);
        return this;
    }

    public P02_RegistrationPage Enter_last_name(String lastName) {
        driver.findElement(this.LastName_textbox).sendKeys(lastName);
        return this;
    }

    public P02_RegistrationPage Enter_Email(String email) {
        driver.findElement(this.Email_textbox).sendKeys(email);
        return this;
    }

    public P02_RegistrationPage Enter_password(String password) {
        driver.findElement(this.Password_textbox).sendKeys(password);
        return this;
    }

    public P02_RegistrationPage ConfirmPassword(String password) {
        driver.findElement(this.ConfirmPassword_textbox).sendKeys(password);
        return this;
    }

    public P02_RegistrationPage RegisterButton() {
        driver.findElement(this.Register_Button).click();
        return this;
    }
}



