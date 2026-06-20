package StrategyPatternGYM;

public class CardioProgram implements TrainingProgram{
    @Override
    public int beregnKalorier(int minutter) {
        return 12 * minutter;
    }
}
