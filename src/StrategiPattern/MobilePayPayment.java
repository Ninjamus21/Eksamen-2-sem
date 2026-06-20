package StrategiPattern;

public class MobilePayPayment implements PaymentStrategy{
    private String phoneNumber;

    public MobilePayPayment(String creditkortNummer) {
        phoneNumber = creditkortNummer;
    }

    @Override
    public double pay(double Amount) {
        System.out.println("du betalte " + Amount + "kr " + phoneNumber);
        return Amount;
    }
}
