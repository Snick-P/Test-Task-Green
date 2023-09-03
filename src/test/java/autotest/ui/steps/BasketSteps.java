package autotest.ui.steps;

import autotest.ui.page.BasketPage;

public class BasketSteps {

    BasketPage basketPage = new BasketPage();
    public void submit()  {
          basketPage.getSubmitButton().click();
    }
}
