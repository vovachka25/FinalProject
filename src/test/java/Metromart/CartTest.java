package Metromart;

import PageObject.ProductItem;
import Runner.ChromeRunner;
import StepObject.CartSteps;
import StepObject.LoginSteps;
import StepObject.ShopSteps;
import Utils.TestLister;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Listeners(TestLister.class)
public class CartTest extends ChromeRunner {
    @BeforeTest
    public static void Authenticate() {
        ChromeRunner.Auth();
        sleep(2000);
        LoginSteps loginSteps = new LoginSteps();
        loginSteps.GoToProfile();
    }
    @Test
    @Description("Verify cart shop functionality")
    @Severity(SeverityLevel.BLOCKER)
    public void AddToCart(){
        ShopSteps shopSteps = new ShopSteps();
        shopSteps.SearchProduct("SAMSUNG");

        ProductItem product = shopSteps.GetProduct(0);
        String productName = product.GetName();
        product.AddToCart();

        CartSteps cartSteps = new CartSteps();
        cartSteps.OpenCart();
        cartSteps.CartDialog.shouldHave(Condition.text(productName));

        cartSteps.RemoveProductsFromCart();
        cartSteps.EmptyCartMessage.shouldBe(Condition.visible);
        cartSteps.CloseDialog();
    }
}
