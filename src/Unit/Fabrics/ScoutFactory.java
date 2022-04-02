package Unit.Fabrics;


import Unit.*;

public class ScoutFactory implements UnitFactory {

    public Unit factoring() {


        return Scout.create();
    }
}
