package Unit.Fabrics;


import Unit.*;
import Unit.Thrower;

public class ThrowerFactory implements UnitFactory {
    public Unit factoring() {


        return Thrower.create();
    }


}
