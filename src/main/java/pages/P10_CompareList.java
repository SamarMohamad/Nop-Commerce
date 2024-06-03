package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class P10_CompareList {

    WebDriver driver;

    public P10_CompareList(WebDriver driver) {
        this.driver = driver;
    }

    private final By Books_Tap = By.xpath("//ul[@class=\"top-menu notmobile\"]/li[5]");
    private final By First_item = By.xpath("(//button)[3]");
    private final By Second_item = By.xpath("(//button)[7]");
    private final By Third_item = By.xpath("(//button)[9]");

    public P10_CompareList BooksTap() {
        driver.findElement(this.Books_Tap).click();
        return this;
    }

    public P10_CompareList FirstItem() {
        driver.findElement(this.First_item).click();
        return this;
    }


    public P10_CompareList SecondItem() {
        driver.findElement(this.Second_item).click();
        return this;
    }

    public P10_CompareList ThirdItem() {
        driver.findElement(this.Third_item).click();
        return this;
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "https://demo.nopcommerce.com/cart");
    }



}
