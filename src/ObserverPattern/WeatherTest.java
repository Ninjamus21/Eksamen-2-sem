package ObserverPattern;

public class WeatherTest {
    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();

        CurrentDisplay current = new CurrentDisplay();
        AverageDisplay average = new AverageDisplay();

        station.addObserver(current);
        station.addObserver(average);

        station.setTemperature(22.5);
        station.setTemperature(18.0);
        station.setTemperature(25.0);

        station.removeObserver(current);

        station.setTemperature(30.0);
    }
}