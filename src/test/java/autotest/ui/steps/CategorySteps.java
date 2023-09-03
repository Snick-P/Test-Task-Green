package autotest.ui.steps;

import autotest.ui.page.DefaultCategoryItemPage;

public class CategorySteps {
    DefaultCategoryItemPage categoryPage = new DefaultCategoryItemPage();

//    Ввиду неудобства исп. явных названий товаров, выбираю товар по номеру в списке

    public String selectItems(int itemsNom) {
        String itemsName = categoryPage.getItemsList().get(itemsNom).getText();
        categoryPage.getItemsList().get(itemsNom).click();
        return itemsName;

    }

}
