package autotest.ui.page.main;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;

@Getter
public class Widget {
    SelenideElement
            whatsNewButton = $x("//a[@id='ui-id-3']"),

    womenCategory = $x("//a[@id='ui-id-4']"),

    womenTops = $x("//a[@id='ui-id-9']"),
            womenJackets = $x("//a[@id='ui-id-11']"),
            womenHoodies = $x("//a[@id='ui-id-12']"),
            womenTees = $x("//a[@id='ui-id-13']"),
            womenBras = $x("//a[@id='ui-id-14']"),

    womenBottom = $x("//a[@id='ui-id-10']"),
            womenPants = $x("//a[@id='ui-id-15"),
            womenShorts = $x("//a[@id='ui-id-16"),

    menCategory = $x("//a[@id='ui-id-5']"),
    menTops = $x("//a[@id='ui-id-17']"),
    menHoodies = $x("//a[@id='ui-id-20']");


}
