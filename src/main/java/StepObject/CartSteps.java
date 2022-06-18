package StepObject;

import PageObject.CartDialog;
import io.qameta.allure.Step;

public class CartSteps extends CartDialog {
    @Step("Opens cart")
    public CartSteps OpenCart(){
        CartButton.click();
        return this;
    }
    public CartSteps CloseDialog(){
        DialogCloseButton.click();
        return this;
    }
    public CartSteps RemoveProductsFromCart(){
        GetProduct(0).RemoveFromCart();
        return this;
    }
}
