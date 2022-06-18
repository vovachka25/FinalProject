package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class ProfilePage {
    public SelenideElement
        AdressStreetInput = $("#addressStreet"),
        AdressCityInput = $("#addressCity"),
        AdressZipInput = $("#addressZip"),
        ChangeProfileButton = $(byText("ინფორმაციის შეცვლა")),
        BirthDaySelect = $("#personalBirthDay"),
        BirthMonthSelect = $("#personalBirthMonth"),
        BirthYearSelect = $("#personalBirthYear"),
        SaveProfileButton = $(byText("შენახვა")),
        ProfileBirthDate = $(byText("დაბადების თარიღი")).parent().find("dd");

    public  ElementsCollection ProfileAdress = $(byText("მიწოდების ადგილი")).parent().findAll("dd span");
}
