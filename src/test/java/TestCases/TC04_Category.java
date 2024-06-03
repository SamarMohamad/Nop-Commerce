package TestCases;

import org.testng.annotations.Test;
import pages.P04_Category;

public class TC04_Category extends Testbase {



    @Test(priority = 1, description = "Choose Random Category" , enabled = true)
    public void chooseRandomCategory_P() throws InterruptedException {
         new P04_Category(driver).HoverRandomCategory();

    }


}
