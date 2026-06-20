package StrategiPattern;

import java.util.ArrayList;

public class Clinic {
    private String navn;
    private ArrayList<PaymentStrategy> paymentStrategyArrayList;
    private PaymentStrategy currentStragtegy;
    private ArrayList<Double> amounts;

    public Clinic(String navn) {
        this.navn = navn;
        paymentStrategyArrayList = new ArrayList<>();
        amounts = new ArrayList<>();
    }

    public String getNavn() {
        return navn;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.currentStragtegy = paymentStrategy;
    }
    public void printReceipt(){
       double total = 0;
        for (int i = 0; i < paymentStrategyArrayList.size(); i++) {
            total += amounts.get(i);
        }
        System.out.println("total: " + total + "kr.");
    }

    public void pay(double amount) {
        currentStragtegy.pay(amount);
        paymentStrategyArrayList.add(currentStragtegy);
        amounts.add(amount);

    }
}
