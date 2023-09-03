package autotest.ui.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.$x;


@Getter
public class LoginPage {

    SelenideElement emailInput = $x("//input[@id='email']"),
            passwordInput = $x("//input[@id='pass']"),
            signInButton = $x("//button[@id='send2']");
}


