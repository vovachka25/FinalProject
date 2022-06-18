package StepObject;

import PageObject.ShopPage;
import io.qameta.allure.Step;

public class ShopSteps extends ShopPage {
    @Step("Search {0} products")

    public ShopSteps SearchProduct(String value){
        SearchInput.click();
        SearchInput.setValue(value);
        SearchIcon.click();
        return this;
    }


}
