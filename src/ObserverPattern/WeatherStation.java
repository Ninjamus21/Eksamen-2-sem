package ObserverPattern;

import java.util.ArrayList;

public class WeatherStation implements Subject {
    private double currentTemp;
    private double averageTemp;
    private ArrayList<Observer> observers = new ArrayList<>();

    public WeatherStation() {
        this.currentTemp = currentTemp;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (observers.contains(observer)){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(currentTemp);
        }
    }

    public void setTemperature(double temperature) {
        this.currentTemp = temperature;
        notifyObservers();
    }
}
