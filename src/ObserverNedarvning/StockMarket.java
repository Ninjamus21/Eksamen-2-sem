package ObserverNedarvning;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Subject {
    private String navn;
    private double price;
    private List<Observer> observerList = new ArrayList<>();

    public StockMarket(String navn) {
        this.navn = navn;
    }


    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(navn, price);
        }
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }
}
