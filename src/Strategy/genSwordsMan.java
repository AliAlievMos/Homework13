package Strategy;

import Item.Armor;
import Item.Boots;
import Item.Weapon;
import Unit.SwordsMan;

public class genSwordsMan implements GenerateUnitStrategy{
    @Override
    public void generateUnit() {
        Weapon weaponForSwordsMan = new Weapon("Клинок",8,12,1);
        Boots bootsForSwordsMan = new Boots("Сапоги", 8,13);
        Armor armorForSwordsMan = new Armor("Доспехи", 8,11);
        SwordsMan swordsMan = new SwordsMan(20,"Мечник",14,1);
        weaponForSwordsMan.equipItem(swordsMan);
        bootsForSwordsMan.equipItem(swordsMan);
        armorForSwordsMan.equipItem(swordsMan);
        System.out.println(" СОЗДАН ПЕРСОНАЖ!");
        swordsMan.info();
    }
}
