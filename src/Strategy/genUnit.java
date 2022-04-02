package Strategy;

public class genUnit {
    public static void gen(String nameUnit) {
        if (nameUnit == "Метатель") {

            genUnitContext.setStrategy(new genThrower());
        } if (nameUnit == "Мечник") {

            genUnitContext.setStrategy(new genSwordsMan());
        } if (nameUnit == "Разведчик") {

            genUnitContext.setStrategy(new genScout());
        }
    }


}
