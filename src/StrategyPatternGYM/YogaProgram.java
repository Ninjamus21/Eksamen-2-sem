package StrategyPatternGYM;

public class YogaProgram implements TrainingProgram{
    @Override
    public int beregnKalorier(int minutter) {
        return 3 * minutter;
    }
}
