package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class P07_Filtration {

    WebDriver driver;

    public P07_Filtration(WebDriver driver) {
        this.driver = driver;
    }


    private final By Select_Item = By.xpath("(//a)[@href=\"/shoes\"]");
    private final By Select_color_button = By.xpath("(//input)[4]");
    private final By Add_to_card_button = By.xpath("(//button)[2]");


    public static void hoverOverElement(WebDriver driver) throws InterruptedException {
        WebElement HoverAction = driver.findElement(By.xpath("//a[@href=\"/apparel\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(HoverAction).perform();
        Thread.sleep(1000);
    }

    public P07_Filtration SelectedItem() {
        driver.findElement(this.Select_Item).click();
        return this;
    }

    public P07_Filtration SelectColorButton() {
        driver.findElement(this.Select_color_button).click();
        return this;
    }

    public P07_Filtration AddToCartButton() {
        driver.findElement(this.Add_to_card_button).click();
        return this;

    }
}

