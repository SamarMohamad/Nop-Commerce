package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class P05_ChangeCurrency {
    WebDriver driver;
    public P05_ChangeCurrency(WebDriver driver) {
        this.driver = driver;
    }



    public void selectFromDropdown() throws Exception {
        driver.get("https://demo.nopcommerce.com/"); // Replace with your website URL

        By dropdownLocator = By.xpath("(//select)[1]"); // Replace with your dropdown locator

        String category = "Category 1"; // Choose "Category 1" or "Category 2"

        Select dropdown = new Select(driver.findElement(dropdownLocator));
        if (dropdown.isMultiple()) {
            throw new Exception("This method is not designed for multi-select dropdowns.");
        }

        dropdown.selectByVisibleText("US Dollar"); // Replace with actual option text
    }}



