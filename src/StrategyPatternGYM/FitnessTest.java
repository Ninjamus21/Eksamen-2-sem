package StrategyPatternGYM;

public class FitnessTest {
    public static void main(String[] args) {

        FitnessCenter center = new FitnessCenter("Aarhus Fitness");

        //center.setProgram(new StrengthProgram());
        center.train(60);

        center.setProgram(new CardioProgram());
        center.train(45);

        center.setProgram(new YogaProgram());
        center.train(90);

        center.printSummary();
    }
}