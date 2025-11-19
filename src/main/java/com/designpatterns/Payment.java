package com.designpatterns;

public interface Payment {

    void pay(double amount);

}
class CreaditCardPayment implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Make the payment through CreditCard"+amount);
    }
}
class UpiPayment implements Payment
{
    public void pay(double amount)
    {
        System.out.println("Make the payment through UPI"+amount);
    }
}

class PaymentFactory {
    public static Payment getPaymentMethod(String type) {
        if ("UPI".equalsIgnoreCase(type)) {
            return new UpiPayment();
        } else if ("Credit".equalsIgnoreCase(type)) {

            return new CreaditCardPayment();
        }
        throw new IllegalArgumentException("Unknow payment");
    }
}
