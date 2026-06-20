package StrategiPattern;

public class CreditCardPayment implements PaymentStrategy {
    private String creditcardnumber;

    public CreditCardPayment(String creditcardnumber) {
        this.creditcardnumber = creditcardnumber;
    }

    @Override
    public double pay(double Amount) {
        System.out.println("du betalte " + Amount + "kr" + "('" + creditcardnumber + "')");
        return Amount;
    }
}
