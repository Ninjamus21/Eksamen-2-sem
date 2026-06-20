package StrategyPatternGYM;

import java.util.ArrayList;
import java.util.List;

public class FitnessCenter {
    private String navn;
    private TrainingProgram trainingProgram;
    private List<Integer> træningstid = new ArrayList<>();
    private List<Integer> kalorier = new ArrayList<>();

    public FitnessCenter(String navn) {
        this.navn = navn;
    }

    public void setProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }

    public void train(int minutes){
        if (trainingProgram == null) return;
        int kcal = trainingProgram.beregnKalorier(minutes);
        System.out.println(trainingProgram.getClass().getSimpleName() + " i " + minutes + " min - forbrændt " + kcal + " kcal");

        kalorier.add(kcal);
        træningstid.add(minutes);
    }

    public void printSummary(){
        int totalKcal = 0;
        int totalTid = 0;
        for (Integer i : træningstid) {
            totalTid += i;
        }
        for (Integer i : kalorier) {
            totalKcal += i;
        }
        System.out.println("==== " + navn + " ====");
        System.out.println("Total træning: " + totalTid + " min");
        System.out.println("Total forbrændt: " + totalKcal + " kcal");
    }

}
