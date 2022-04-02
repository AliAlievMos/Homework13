package Strategy;

import Item.Armor;
import Item.Boots;
import Item.Weapon;
import Unit.Thrower;

public class genThrower implements GenerateUnitStrategy {
    @Override
    public void generateUnit() {
        Weapon weaponForThrower = new Weapon("Меательное копье",1,3,15);
        Boots bootsForThrower = new Boots("Сапоги", 3,6);
        Armor armorForThrower = new Armor("Доспехи", 6,7);
        Thrower thrower = new Thrower(8,"Метатель",5,2,3);
        weaponForThrower.equipItem(thrower);
        bootsForThrower.equipItem(thrower);
        armorForThrower.equipItem(thrower);
        System.out.println(" СОЗДАН ПЕРСОНАЖ!");
        thrower.info();

    }
}
