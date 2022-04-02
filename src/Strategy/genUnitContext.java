package Strategy;

public class genUnitContext {

    private static GenerateUnitStrategy strategy;


    public static void setStrategy(GenerateUnitStrategy strategy) {
        genUnitContext.strategy = strategy;

    }
    public static void excuteStrategy() {
        genUnitContext.strategy.generateUnit();
    }




}
