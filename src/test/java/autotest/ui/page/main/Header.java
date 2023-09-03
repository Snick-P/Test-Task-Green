package autotest.ui.page.main;


import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

@Getter
public class Header {

    SelenideElement singInButton = $x("//li[@class='authorization-link']/a"),
            signUpButton = $x("//li/a[text()='Create an Account']"),

    basketIcon = $x("//div[@data-block='minicart']/a"),
            basketCount = $x("//span[@class='counter-number']"),
            searchInput = $x("//input[@id='search']"),

//    Появился для стабильности перехода в корзину
    loadIndication = $("span:has(>span[class='counter-number'])");


}
