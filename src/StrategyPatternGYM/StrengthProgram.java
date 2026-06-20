package StrategyPatternGYM;

public class StrengthProgram implements TrainingProgram {
    @Override
    public int beregnKalorier(int minutter) {
        return 8 * minutter;
    }
}
