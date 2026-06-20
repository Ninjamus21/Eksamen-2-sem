package ObserverPattern;

import java.util.ArrayList;

public class AverageDisplay implements Observer{
    private ArrayList<Double> temperatureList = new ArrayList<>();

    @Override
    public void update(double temperature) {
        temperatureList.add(temperature);
        printAvg();
    }
    public void printAvg(){
        double average = 0;
        for (Double v : temperatureList) {
            average += v / temperatureList.size();
        }
        System.out.println("Gennemsnittet: " + average);
    }
}
