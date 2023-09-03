package autotest.ui.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class SuccessPage {
    SelenideElement message = $x("//span[@data-ui-id='page-title-wrapper']");
}
