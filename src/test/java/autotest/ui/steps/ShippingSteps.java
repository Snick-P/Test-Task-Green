package autotest.ui.steps;

import autotest.ui.page.ShippingPage;
import com.codeborne.selenide.Condition;
import net.datafaker.Faker;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.sleep;


public class ShippingSteps {

    ShippingPage shippingPage = new ShippingPage();

    //    Используется как заглушка. Не стал параметризовать, чтобы не нагружать тестовый метод.
//    TODO мб стоит реализовать через DataTest.class
    public void shippingOrderDefault(){
        Faker faker = new Faker();
        String email = faker.internet().emailAddress();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String streetAddress = "Ne dom i ne ulitca";
        String city = "Saint Petersburg";
        String zipCode = "123456";
        String country = "Russia";
        String phone = faker.phoneNumber().cellPhone();

        shippingPage.getEmailInput().shouldBe(Condition.visible, Duration.ofSeconds(5)).val(email);
        shippingPage.getFirstNameInput().val(firstName);
        shippingPage.getLastNameInput().val(lastName);
        shippingPage.getStreetAddressInput().val(streetAddress);
        shippingPage.getCityInput().val(city);
        shippingPage.getZipCodeInput().val(zipCode);
        shippingPage.getCountrySelect().selectOption(country);
//  FIXME заменить sleep на ожидание состояния элемента. Работает корректно, но увеличивает время прогона
        sleep(5000);
        shippingPage.getPhoneInput().val(phone);
        shippingPage.getSubmitButton().click();


    }

}
