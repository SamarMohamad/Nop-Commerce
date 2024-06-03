package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class P01_HomePage {

        // constructor

        WebDriver driver;
        public P01_HomePage(WebDriver driver){
            PageFactory.initElements(driver,this);
            this.driver=driver;

            //locators
        }
        @FindBy(xpath = "//a[@href=\"/login?returnUrl=%2F\"]")
        WebElement loginTap;

        @FindBy(xpath = "//a[@href=\"/register?returnUrl=%2F\"]")
        WebElement registerTap;

        //Actions
        public void clickLoginTap(){
            this.loginTap.click();
        }
        public void clickRegisterTap(){
            this.registerTap.click();
        }
    }


