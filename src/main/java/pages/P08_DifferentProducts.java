package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class P08_DifferentProducts {

    WebDriver driver;

    public P08_DifferentProducts(WebDriver driver) {
        this.driver = driver;
        driver.get("https://demo.nopcommerce.com/books");
    }

    private final By Books_Tap = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]");
    private final By First_item = By.xpath("(//button)[2]");
    private final By Second_item = By.xpath("(//button)[5]");
    private final By Third_item = By.xpath("(//button)[9]");
    private final By Shopping_Card = By.xpath("(//a)[5]");
    private final By CheckOut_Button = By.xpath("(//button)[9]");


    public P08_DifferentProducts BooksTap() {
        driver.findElement(this.Books_Tap).click();
        return this;
    }

    public P08_DifferentProducts FirstItem() {
        driver.findElement(this.First_item).click();
        return this;
    }


    public P08_DifferentProducts SecondItem() {
        driver.findElement(this.Second_item).click();
        return this;
    }

    public P08_DifferentProducts ThirdItem() {
        driver.findElement(this.Third_item).click();
        return this;
    }


    public P08_DifferentProducts ShoppingCard() {
        driver.findElement(this.Shopping_Card).click();
        return this;
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "https://demo.nopcommerce.com/cart");
    }

    public P08_DifferentProducts CheckOutButton() {
        driver.findElement(this.CheckOut_Button).click();
        return this;
    }

}
