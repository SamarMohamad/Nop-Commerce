package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P06_ResetPassword {
    WebDriver driver;

    public P06_ResetPassword(WebDriver driver) {
        this.driver = driver;
    }

    private final By forgetPassword_link = By.xpath("//a[@href=\"/passwordrecovery\"]");
    private final By Email_textbox = By.xpath("(//input)[3]");
    private final By recover_button = By.xpath("(//button)[2]");

    public P06_ResetPassword Forget_password_function() {
        driver.findElement(this.forgetPassword_link).click();
        return this;
    }

    public P06_ResetPassword send_Email(String email) {
        driver.findElement(this.Email_textbox).sendKeys(email);
        return this;
    }


    public P06_ResetPassword Recovery_Button() {
        driver.findElement(this.recover_button).click();
        return this;
    }

}
