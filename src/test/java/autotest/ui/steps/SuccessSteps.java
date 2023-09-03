package autotest.ui.steps;

import autotest.ui.page.SuccessPage;

public class SuccessSteps {

    SuccessPage successPage = new SuccessPage();

    public String messageText (){
    return successPage.getMessage().getText();
    }
}
