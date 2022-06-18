package StepObject;

import PageObject.ProfilePage;
import io.qameta.allure.Step;

public class ProfileSteps extends ProfilePage {
    @Step("Click profile button")
    public ProfileSteps StartChangeProfile(){
        ChangeProfileButton.click();
        return this;
    }
    public ProfileSteps FillAdressStreet(String street){
        AdressStreetInput.setValue(street);
        return this;
    }
    public ProfileSteps FillAdressCity(String city){
        AdressCityInput.setValue(city);
        return this;
    }
    public ProfileSteps FillAdressZip(String zip){
        AdressZipInput.setValue(zip);
        return this;
    }
    public ProfileSteps FillBirthDate(int day, int month, String year){
        BirthDaySelect.selectOption(day);
        BirthMonthSelect.selectOption(month);
        BirthYearSelect.selectOption(year);
        return this;
    }
    public ProfileSteps SaveProfile(){
        SaveProfileButton.click();
        return this;
    }



}
