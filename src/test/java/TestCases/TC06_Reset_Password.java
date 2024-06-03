package TestCases;

import org.testng.annotations.Test;
import pages.P06_ResetPassword;

import static TestCases.TC02_Registration.email;


public class TC06_Reset_Password extends Testbase {

    @Test(priority = 1, description = " Check forget password function " , enabled = true)
        public void checkPasswordFunction_P(){
        new P06_ResetPassword(driver).send_Email(email).Recovery_Button();
    }

    }

