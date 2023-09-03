package autotest.ui.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class PaymentsPage {

    SelenideElement placeOrderButton = $x("//button[@class='action primary checkout']");
}
