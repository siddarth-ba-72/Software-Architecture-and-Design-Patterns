package SolidDesignPrinciples.DependencyInversion.Task;

public class WebStore {

    private PaymentController paymentController;

    public WebStore() {
        paymentController = new PaymentController();
        paymentController.setPaymentMethod(new Skrill());
    }

    public void purchaseItem() {
        this.paymentController.pay();
    }
}
