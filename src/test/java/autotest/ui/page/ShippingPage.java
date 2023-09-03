package autotest.ui.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class ShippingPage {

    SelenideElement
            emailInput = $x("//input[@id='customer-email']"),
            firstNameInput = $x("//input[@name='firstname']"),
            lastNameInput = $x("//input[@name='lastname']"),
            streetAddressInput = $x("//input[@name='street[0]']"),
            cityInput = $x("//input[@name='city']"),
            zipCodeInput = $x("//input[@name='postcode']"),


    //   Определиться с селектором страны, как выбирать
    countrySelect = $x("//select[@name='country_id']"),
            phoneInput = $x("//input[@name='telephone']"),

            submitButton = $x("//div[@id='shipping-method-buttons-container']//button");


}
