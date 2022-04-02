package Strategy;

import Item.Armor;
import Item.Boots;
import Item.Weapon;
import Unit.Scout;

public class genScout  implements GenerateUnitStrategy{
    @Override
    public void generateUnit() {

        Weapon weaponForScout = new Weapon("Легкий кинжал",1,3,9);
        Boots bootsForScout = new Boots("Быстрейшие сапоги", 1,13);
        Armor armorForScout = new Armor("Легкие доспехи", 1,4);
        Scout scout = new Scout(5,"Разведчик",5,9);
        weaponForScout.equipItem(scout);
        bootsForScout.equipItem(scout);
        armorForScout.equipItem(scout);
        System.out.println(" СОЗДАН ПЕРСОНАЖ!");
        scout.info();

    }
}
