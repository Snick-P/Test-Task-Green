package autotest.ui.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class PaymentPage {

    SelenideElement
            orderDetails = $x("//div[@class='billing-address-details']"),
            submitButton = $x("//button[@class='action primary checkout']"),
            billingAndShippingSameAddress = $x("//input[@id='billing-address-same-as-shipping-checkmo']");


}
