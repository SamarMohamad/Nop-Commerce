package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class PageBase {
    WebDriver driver;


    public PageBase(WebDriver driver) {
        this.driver = driver;
    }

    private final By Search_text = By.xpath("(//input)[2]");

    public PageBase searchWithKeyword() {
        driver.findElement(this.Search_text).sendKeys("laptop", Keys.ENTER);
        return this;
    }

}




