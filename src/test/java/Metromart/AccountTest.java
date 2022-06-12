package Metromart;

import Runner.ChromeRunner;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AccountTest extends ChromeRunner {
    @BeforeTest
    public static void Authenticate() {
        ChromeRunner.Auth();
        $("#headerProfileContent").shouldBe(Condition.visible);
        $("#headerProfileContent").click();
    }

    @Test
    public void ChangeProfile() {
        $(byText("ინფორმაციის შეცვლა")).click();

        String address = faker.address().streetName();
        String city = faker.address().city();
        String zip = faker.address().zipCode();

        $("#addressStreet").setValue(address);
        $("#addressCity").setValue(city);
        $("#addressZip").setValue(zip);

        $("#personalBirthDay").selectOption(25);
        $("#personalBirthMonth").selectOption(10);
        $("#personalBirthYear").selectOption("1995");

        $(byText("შენახვა")).click();

        $(byText("დაბადების თარიღი")).parent().find("dd").shouldHave(Condition.text("25.10.1995"));
//        String actualBirthDate = $(byText("დაბადების თარიღი")).parent().find("dd").innerText();
//        Assert.assertEquals(actualBirthDate, "25.10.1995");
        ElementsCollection addressElements = $(byText("მიწოდების ადგილი")).parent().findAll("dd span");

        Assert.assertEquals(addressElements.get(0).innerText(), address);
        Assert.assertEquals(addressElements.get(1).innerText(), city);
        Assert.assertEquals(addressElements.get(2).innerText(), zip);
    }
}
