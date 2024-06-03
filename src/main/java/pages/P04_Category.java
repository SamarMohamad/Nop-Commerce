package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static util.Utility.getRandomIntBetweenOneAndSeven;


public class P04_Category {
    WebDriver driver;

    public P04_Category(WebDriver driver) {
        this.driver = driver;
    }

    public P04_Category HoverRandomCategory() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement randomCategory = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+getRandomIntBetweenOneAndSeven() +"]"));
        action.moveToElement(randomCategory);
        Thread.sleep(1000);
        return this;
    }
}
