package autotest.ui.steps;

import autotest.ui.page.DefaultItemPage;
import com.codeborne.selenide.Condition;


public class ItemSteps {

    DefaultItemPage itemPage = new DefaultItemPage();

    public void selectColors(String colors) {
        itemPage.getColorSelector().find(Condition.attributeMatching("option-label", colors)).click();
    }

    public void selectSize(String size) {
        itemPage.getSizeSelector().findBy(Condition.attributeMatching("option-label", size)).click();
    }

    //    Оставил строкой для удобства assert, т.к. количество в корзине - строка
    public void selectQty(String qty) {
        itemPage.getQty().val(qty);
    }

    public void addToCartButton() {
        itemPage.getAddToCartButton().click();
        itemPage.getAddToCartButton().shouldHave(Condition.text("Add to Cart"));
    }

// TODO   Планировал использовать в assert, не успел реализовать.
    public String itemName() {
        return itemPage.getItemsName().getText();
    }

    public String addItemToCart(String color, String size, String qty) {
        selectSize(size);
        selectColors(color);
        selectQty(qty);
        addToCartButton();
        return itemPage.getItemsName().getText();
    }
}
