package TestCases;

import org.testng.annotations.Test;
import pages.P10_CompareList;

public class TC10_CompareList extends Testbase{

        @Test(priority = 1, description = "Add Different products to Compare list")
        public void AddDifferentProductsToCompareList_P(){
            new P10_CompareList(driver).BooksTap().FirstItem().SecondItem().ThirdItem().scrollDown();
        }


    }
