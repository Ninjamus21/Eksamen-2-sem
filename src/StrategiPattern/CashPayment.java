package StrategiPattern;

public class CashPayment implements PaymentStrategy {

    @Override
    public double pay(double Amount) {
        System.out.println("du betalte " + Amount + "kr");
        return Amount;
    }
}
