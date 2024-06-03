package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P03_LoginPage {

        // TODO: Step1: Constructor
       // TODO step2: define locators
     // TODO: step3 define action methods

    WebDriver driver;
      //constructor
   public P03_LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    //locators
    private final By Email_Text = By.xpath("(//input)[3]");
    private final By Password_text = By.xpath("(//input)[4]");
    private final By Login_button=By.xpath("(//button)[3]");

    //Actions
    public  P03_LoginPage inputEmail(String email ) {
        driver.findElement(this.Email_Text).sendKeys(email);
        return this ;
    }
    public  P03_LoginPage  inputPassword (String password ) {
        driver.findElement(this.Password_text).sendKeys(password);
        return this ;
    }
    public  P03_LoginPage  Login_Button() {
        driver.findElement(this.Login_button).click();
        return this ;
    }
}


//    }


