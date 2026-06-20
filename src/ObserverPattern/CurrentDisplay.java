package ObserverPattern;

public class CurrentDisplay implements Observer{

    @Override
    public void update(double temperature) {
        System.out.println("current temp " + temperature);
    }
}
