package autotest.ui.steps;

import autotest.ui.page.main.Widget;
import com.codeborne.selenide.Condition;

public class WidgetSteps {

    Widget widget = new Widget();
//TODO на вход принимать название категории, через switch case выбирать метод.

//  контроль состояния добавлен в связи с падением теста

    public void goToWJacket (){
        widget.getWomenCategory().shouldBe(Condition.visible).hover();
        widget.getWomenTops().shouldBe(Condition.visible).hover();
        widget.getWomenJackets().click();
    }

    public void goToMHoodies(){
        widget.getMenCategory().shouldBe(Condition.visible).hover();
        widget.getMenTops().shouldBe(Condition.visible).hover();
        widget.getMenHoodies().shouldBe(Condition.visible).click();
    }


}
