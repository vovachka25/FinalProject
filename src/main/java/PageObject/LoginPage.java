package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public SelenideElement
        StartLoginButton = $("#headerProfileContent"),
        EmailInput = $("#login-email"),
        PasswordInput = $("#login-password"),
        LoginButton = $("#loginButtonStep2"),
        ProfileButton = $("#headerProfileContent"),
        Greating = $(".customer-heading");

}
