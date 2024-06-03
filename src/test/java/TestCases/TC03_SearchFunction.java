package TestCases;


import org.testng.annotations.Test;
import pages.PageBase;

public class TC03_SearchFunction extends Testbase{

    @Test(priority = 1, description = "check search function" ,enabled = true)
    public void searchFunction_P() {
        new PageBase(driver).searchWithKeyword();
    }


    }




