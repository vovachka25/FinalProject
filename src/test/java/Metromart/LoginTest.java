package Metromart;

import Runner.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;


public class LoginTest extends ChromeRunner {
    @Test
    public void Login(){
        ChromeRunner.Auth();

        $("#headerProfileContent").shouldBe(Condition.visible);
        $("#headerProfileContent").click();

        $(".customer-heading").shouldHave(Condition.text("Testuser , გამარჯობა!"));
    }
}
