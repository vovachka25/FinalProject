package Runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.$;

public class ChromeRunner {
    @BeforeTest

    public static void Setup(){
        Selenide.open("https://metromart.ge/ka_GE/");
        Configuration.browserSize = "1600 x 1200";
    }

    public void Auth(){
        $("#headerProfileContent").click();

        $("#login-email").setValue("jesitydu@ema-sofia.eu");
        $("#login-password").setValue("testpassword123");
        $("#loginButtonStep2").click();
    }
}
