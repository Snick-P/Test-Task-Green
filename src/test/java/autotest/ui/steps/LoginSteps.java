package autotest.ui.steps;

import autotest.ui.page.LoginPage;
import com.codeborne.selenide.Condition;

public class LoginSteps {

//    TODO мб реализовать через Spring Beans
    LoginPage loginPage = new LoginPage();

    public void singIn (String email, String password){

        loginPage.getEmailInput().shouldBe(Condition.visible).val(email);
        loginPage.getPasswordInput().val(password);
        loginPage.getSignInButton().click();
    }


}
