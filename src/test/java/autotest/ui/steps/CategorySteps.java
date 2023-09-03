package autotest.ui.steps;

import autotest.ui.page.DefaultCategoryItemPage;

public class CategorySteps {
    DefaultCategoryItemPage categoryPage = new DefaultCategoryItemPage();

//    Ввиду неудобства исп. явных названий товаров, выбираю товар по номеру в списке

    public String selectItems(int itemsNum) {
        String itemsName = categoryPage.getItemsList().get(itemsNum).getText();
        categoryPage.getItemsList().get(itemsNum).click();
        return itemsName;

    }

}
