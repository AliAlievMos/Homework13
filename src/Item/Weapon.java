package Item;

import Unit.Unit;

public class Weapon  extends Item{
    int accuracy;
    public int damage;
    public Weapon(String name, int weight, int damage, int accuracy) {
        super(name, weight);
        this.damage = damage;
        this.accuracy = accuracy;

    }

    @Override
    public void equipItem(Unit unit) {
        System.out.println(unit.name +" экиперует " + this.name);
        unit.weapon = this;

    }
}
