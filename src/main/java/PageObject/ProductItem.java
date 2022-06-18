package PageObject;

import com.codeborne.selenide.SelenideElement;

public class ProductItem {
    public SelenideElement item;
    public ProductItem(SelenideElement item){
        this.item = item;
    }

    public String GetName(){
        return item.find("[itemprop=\"name\"").innerText();
    }

    public void AddToCart(){
        item.find(".fa.fa-shopping-cart").click();
    }
}
