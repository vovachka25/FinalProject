package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ShopPage {
    public SelenideElement
        SearchInput = $("#searchTop"),
        SearchIcon = $("#searchButtonTop"),
        ProductGrid = $("#products_grid");
    ElementsCollection Products = ProductGrid.findAll(".product-item");


    public ProductItem GetProduct(int index){
        return new ProductItem(Products.get(index));
    }




}
