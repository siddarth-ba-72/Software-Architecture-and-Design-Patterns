package SolidDesignPrinciples.DependencyInversion.Task;

public class PaymentController {

    private PaymentMethod paymentMethod;

    public PaymentController() {
    }

    //we can change behaviour runtime
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        this.paymentMethod.pay();
    }
}
