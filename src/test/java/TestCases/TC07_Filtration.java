package TestCases;

import org.testng.annotations.Test;
import pages.P07_Filtration;

public class TC07_Filtration extends Testbase{


    @Test(priority = 1, description = "select specific category" , enabled = false)
    public void chooseSpecificCategory_P() throws InterruptedException {
        new P07_Filtration(driver).hoverOverElement(driver);
        Thread.sleep(1000);
        new P07_Filtration(driver).SelectedItem().SelectColorButton().AddToCartButton();
    }

}
