package PageObject;

import com.codeborne.selenide.SelenideElement;

public class CartProductItem {
    public SelenideElement item;
    public CartProductItem(SelenideElement item){
        this.item = item;
    }

    public void RemoveFromCart(){
        item.find(".mm_cart_link_remove").click();
    }
}
