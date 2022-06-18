package Metromart;

import Runner.ChromeRunner;
import StepObject.LoginSteps;
import Utils.TestLister;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners(TestLister.class)
public class LoginTest extends ChromeRunner {
    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify login functionality")
    public void Login(){
        ChromeRunner.Auth();

        LoginSteps loginSteps = new LoginSteps();

        Assert.assertTrue(loginSteps.ProfileButton.isDisplayed());
        sleep(1000);
        loginSteps.GoToProfile();

        Assert.assertEquals(loginSteps.Greating.text(),"Testuser , გამარჯობა!");
    }
}
