package TestCases;

import org.testng.annotations.Test;
import pages.P09_WishList;

public class TC09_WishList extends Testbase{

    @Test(priority = 1, description = "Add Different products to Wish list" , enabled = true)
    public void AddDifferentProductsToWishlist_P(){
        new P09_WishList(driver).BooksTap().FirstItem().SecondItem().ThirdItem().scrollDown();
    }

}
