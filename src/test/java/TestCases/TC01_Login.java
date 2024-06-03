package TestCases;

import org.testng.annotations.Test;
import pages.P03_LoginPage;


public class TC01_Login extends Testbase {

//     define test data
    String email = "test@test.com";
    String password = "password123";

    @Test(priority = 1, description = "check login with valid data new design" ,enabled = true)
    public void checkLoginWithValidData_P() {
        new P03_LoginPage(driver).inputEmail(email).inputPassword(password).Login_Button();
    }

}


