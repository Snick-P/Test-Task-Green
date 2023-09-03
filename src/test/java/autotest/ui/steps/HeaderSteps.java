package autotest.ui.steps;

import autotest.ui.page.main.Header;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.sleep;


public class HeaderSteps {
    Header header = new Header();


    public void goToBasket() {
//   Обеспечивает стабильность перехода в корзину, в противном случае тест падает
        header.getLoadIndication().shouldHave(Condition.attribute("class","counter qty"));
        sleep(200);
        header.getBasketIcon().click();

    }

    public String basketCount() {
        String count = header.getBasketCount().getText();
        return count;
    }

    public void toAuth(){
        header.getSingInButton().click();
    }

}
