package autotest.ui.page;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class DefaultItemPage {

    //    Селекторы определены через коллекции для стабильности тестов, т.е нет ошибок при отсутствии в карточке товара размера или цвета
    ElementsCollection sizeSelector = $$x("//div[@aria-labelledby='option-label-size-143']/div"),
            colorSelector = $$x("//div[@aria-labelledby='option-label-color-93']/div");

    //    Селекторы исключают карточки из Related Products
    SelenideElement qty = $x("//input[@id='qty']"),
            addToCartButton = $x("//button[@title='Add to Cart']"),
            updateCartButton = $x("//button[@title='Update Cart']"),
            addToWishList = $x("//div[@class='product-social-links']//span[text()='Add to Wish List']"),
            itemsName = $x("//span[@data-ui-id='page-title-wrapper']");


}
