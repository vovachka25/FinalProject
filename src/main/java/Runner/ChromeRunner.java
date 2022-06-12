package Runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.$;

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
        $("#headerProfileContent").click();

        $("#login-email").setValue("jesitydu@ema-sofia.eu");
        $("#login-password").setValue("testpassword123");
        $("#loginButtonStep2").click();
    }
}
