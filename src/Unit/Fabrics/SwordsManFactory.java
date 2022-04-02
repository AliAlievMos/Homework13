package Unit.Fabrics;


import Unit.*;

public class SwordsManFactory implements UnitFactory {

    public Unit factoring() {


        return SwordsMan.create();
    }
}
