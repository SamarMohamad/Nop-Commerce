package TestCases;

import org.testng.annotations.Test;

import pages.P08_DifferentProducts;

public class TC08_DifferentProducts extends Testbase {

    @Test(priority = 1, description = "Add Different products to the card" , enabled = false)
    public void AddDifferentProductsToTheCard_P(){
        new P08_DifferentProducts(driver).BooksTap().FirstItem().SecondItem().ThirdItem()
                .ShoppingCard().CheckOutButton().scrollDown();
    }

}




