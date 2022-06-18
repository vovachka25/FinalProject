package Runner;

import StepObject.LoginSteps;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;

import static DataObject.Credentials.Email;
import static DataObject.Credentials.Password;

public class ChromeRunner {
    public Faker faker;

    public ChromeRunner() {
       this.faker = Faker.instance();
    }

    @BeforeTest

    public static void Setup(){
        Selenide.open("https://metromart.ge/ka_GE/");
        Configuration.browserSize = "1920 x 969";
    }

    public static void Auth(){
        LoginSteps loginSteps = new LoginSteps();
        loginSteps
            .OpenLoginDialog()
            .FillEmail(Email)
            .FillPassword(Password)
            .ClickLogin();
    }
}
