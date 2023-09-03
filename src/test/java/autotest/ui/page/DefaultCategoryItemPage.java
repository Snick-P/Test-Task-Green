package autotest.ui.page;

import com.codeborne.selenide.ElementsCollection;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$$x;

@Getter
public class DefaultCategoryItemPage {

    ElementsCollection itemsList = $$x("//strong[@class='product name product-item-name']/a");


}
