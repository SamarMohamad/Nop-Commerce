package TestCases;
import org.testng.annotations.Test;
import pages.P02_RegistrationPage;

import static util.Utility.generateRandomEmail;
import static util.Utility.generateRandomFirstName;

public class TC02_Registration extends Testbase {


       // define test data
    String firstName = generateRandomFirstName();
    String lastName = generateRandomFirstName();
    static String email = generateRandomEmail();
    static String password = "P@ssw0rd123";


@Test(priority = 1 , description = "Register New User With Valid Data" ,enabled = true)
public void RegisterNewUserWithValidData_P() {

    new P02_RegistrationPage(driver).SelectGender().Enter_first_name(firstName).Enter_last_name(lastName).
            Enter_Email(email).Enter_password(password).ConfirmPassword(password).RegisterButton();


    }


}










