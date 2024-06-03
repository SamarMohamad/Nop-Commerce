package TestCases;

import org.testng.annotations.Test;
import pages.P05_ChangeCurrency;

public class TC05_ChangeCurrency extends Testbase{

    @Test(priority = 1 , description = "Select Currency" , enabled = true)

        public void selectCurrency_P() throws Exception {
        new  P05_ChangeCurrency(driver).selectFromDropdown();
    }



    }

