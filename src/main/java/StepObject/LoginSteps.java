package StepObject;

import PageObject.LoginPage;
import io.qameta.allure.Step;

public class LoginSteps extends LoginPage {
    @Step("Open login dialog")
    public LoginSteps OpenLoginDialog(){
        StartLoginButton.click();
        return this;
    }
    public LoginSteps FillEmail(String email){
        EmailInput.setValue(email);
        return this;
    }
    public LoginSteps FillPassword(String password){
        PasswordInput.setValue(password);
        return this;
    }
    public LoginSteps ClickLogin(){
        LoginButton.click();
        return this;
    }
    public LoginSteps GoToProfile(){
        ProfileButton.click();
        return this;
    }
}
