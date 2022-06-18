package Metromart;

import Runner.ChromeRunner;
import StepObject.LoginSteps;
import StepObject.ProfileSteps;
import Utils.TestLister;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;


@Listeners(TestLister.class)
public class AccountTest extends ChromeRunner {
    @BeforeTest
    public static void Authenticate() {
        ChromeRunner.Auth();
        sleep(2000);
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.GoToProfile();
    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify change profile functionality")
    public void ChangeProfile() {
        String address = faker.address().streetName();
        String city = faker.address().city();
        String zip = faker.address().zipCode();

        ProfileSteps profileSteps = new ProfileSteps();
        profileSteps
            .StartChangeProfile()
            .FillAdressStreet(address)
            .FillAdressCity(city)
            .FillAdressZip(zip)
            .FillBirthDate(25, 10, "1995")
            .SaveProfile();

        sleep(1000);

        Assert.assertEquals(profileSteps.ProfileBirthDate.text(), "25.10.1995");
        Assert.assertEquals(profileSteps.ProfileAdress.get(0).text(), address);
        Assert.assertEquals(profileSteps.ProfileAdress.get(1).text(), city);
        Assert.assertEquals(profileSteps.ProfileAdress.get(2).text(), zip);
    }
}
