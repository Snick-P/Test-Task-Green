package autotest.ui.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class BasketPage {
    SelenideElement submitButton = $x("//button[@title='Proceed to Checkout']");
}
