package autotest.ui.steps;

import autotest.ui.page.PaymentsPage;

public class PaymentSteps {
    PaymentsPage paymentsPage = new PaymentsPage();

    public void submit(){
        paymentsPage.getPlaceOrderButton().click();
    }
}
