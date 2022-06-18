package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CartDialog {
    public SelenideElement
            CartButton = $("#cartHead"),
            EmptyCartMessage = $(byText("თქვენი კალათა ცარიელია!")),
            DialogCloseButton = $(".fancybox-close-small"),
            CartDialog = $("#minicartPopup"),
            ProductContainer = $(".minicart-popup-list");

    public ElementsCollection Products = ProductContainer.findAll(".minicart-popup-item");

    public CartProductItem GetProduct(int index){
        return new CartProductItem(Products.get(index));
    }




}
