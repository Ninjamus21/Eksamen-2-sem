package StrategiPattern;

public class PaymentTest {
        public static void main(String[] args) {

            Clinic clinic = new Clinic("Aarhus Dyreklinik");

            clinic.setPaymentStrategy(new CashPayment());
            clinic.pay(450.00);

            clinic.setPaymentStrategy(new CreditCardPayment("4532-XXXX-XXXX-1234"));
            clinic.pay(750.00);

            clinic.setPaymentStrategy(new MobilePayPayment("12345678"));
            clinic.pay(200.00);

            clinic.printReceipt();
        }
    }
