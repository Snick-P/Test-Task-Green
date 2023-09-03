package autotest.ui.test;

import autotest.ui.steps.*;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Owner;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class TestRunner {
    //    TODO прокинуть email & password через файл настройки
    private static String email = "idk@test.com";
    private static String pass = "Test@123";

    @BeforeAll
    public static void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        baseUrl = "https://magento.softwaretestingboard.com/";
        browser = "chrome";
        browserSize = "1920x1080";
        headless = false;
        holdBrowserOpen = true;
    }

    @AfterEach
    public void closeDriver() {
        closeWebDriver();
    }

    @Test
    public void debug1() {
        LoginSteps loginSteps = new LoginSteps();
        HeaderSteps headerSteps = new HeaderSteps();
        WidgetSteps widgetSteps = new WidgetSteps();

        step("Открыть базовую страницу", () ->
                open(baseUrl));
        step("Перейти на страницу аутентификация", () ->
                headerSteps.toAuth());
        step("Войти в профиль", () ->
                loginSteps.singIn(email, pass));
//        TODO добавить проверку
        step("Перейти в категорию товаров", ()->
                widgetSteps.goToMHoodies());
    }

    @DisplayName("Покупка незарегистрированным пользователем")
    @Owner("snproskuryakov")
    @ParameterizedTest
    @CsvSource(textBlock = """
            1 ; Blue ; M ; 1
            3 ; Black ; S ; 2
            """,
            delimiter = ';')

    public void notLogInBuyer(int itemsNom, String color, String size, int quantity) {
        String qty = String.valueOf(quantity);

        ItemSteps itemSteps = new ItemSteps();
        HeaderSteps headerSteps = new HeaderSteps();
        WidgetSteps widgetSteps = new WidgetSteps();
        CategorySteps categorySteps = new CategorySteps();
        BasketSteps basketSteps = new BasketSteps();
        ShippingSteps shippingSteps = new ShippingSteps();
        PaymentSteps paymentSteps = new PaymentSteps();
        SuccessSteps successSteps = new SuccessSteps();

        step("Открыть базовую страницу", () ->
                open(baseUrl));
        step("Перейти в категорию товаров", () ->
                widgetSteps.goToWJacket());
        String expectName = step("Выбрать товар", () ->
                categorySteps.selectItems(itemsNom));
        String actualName = step("Добавить товар в корзину", () ->
                itemSteps.addItemToCart(color, size, qty));
        step("Проверить соответствие наименования товара", () ->
                assertThat(actualName.equals(expectName)));
        step("Проверить количество товара в корзине", () ->
                assertThat(headerSteps.basketCount().equals(qty)));
        step("Перейти в корзину", () ->
                headerSteps.goToBasket());
        step("Перейти к оформлению заказа", () ->
                basketSteps.submit());
        step("Перейти к оформлению доставки", () ->
                shippingSteps.shippingOrderDefault());
//        TODO добавить проверку правильности данных пользователя
        step("Подтвердить оплату", () ->
                paymentSteps.submit());
//        TODO добавить тест на изменение платежных данных
        step("Проверить успешность оплаты", () ->
                assertThat(successSteps.messageText().equals("Thank you for your purchase!")));
    }

}
