package Unit;

import Item.Armor;
import Item.Boots;
import Item.Weapon;

public abstract class Unit {
    public  Weapon weapon;
    public Boots boots;
    public Armor armor;
    public int accuracy;
    int hp;
    public String name;
    int damage;
    public int run;
    public int weightAll;

    public Unit(int hp, String name, int damage, int run){
        this.hp = hp;
        this.name = name;
        this.damage = damage;
        this.run = run;
        this.weapon = null;
        this.boots = null;
        this.armor = null;



    }
    public void attack(Unit target) {
        if (target.weapon != null) damage = target.weapon.damage - target.armor.armor;
        if (target.weapon == null) damage -= target.armor.armor;

        if (target.hp <= 0) {
            System.out.println("Он мертв! С ним уже не подерешься!");
        } else {
            if (damage > 0) {
                target.hp -= damage;
                System.out.println(name + " наносит " + damage + " урона!");
                if (target.hp <= 0) {
                    System.out.println(target.name + " мертв!");

                }
            } else if (damage <= 0) {
                System.out.println(name + " не пробил броню " + target.name);
            }

        }
    }
    public Integer chkRun(Unit unit){
        unit.run = (unit.run + unit.boots.run) - chkWeightAll(this);
        run = unit.run;
        return run;

    }public Integer chkWeightAll(Unit unit){
        unit.weightAll = unit.weapon.weight;
        weightAll = unit.weightAll;
        return weightAll;

    }
    public void info(){
        System.out.println("Юнит: " + this.name);
        System.out.println("Оружие: " + this.weapon.name);
        System.out.println("Доспехи: " + this.armor.name);
        System.out.println("Ботинки: " + this.boots.name);

        System.out.println("Общие характеристики:");
        System.out.println("Здоровье: " + this.hp);
        System.out.println("Броня: " + this.armor.armor);
        System.out.println("Скорость: " + chkRun(this));
        System.out.println("Урон: " + this.weapon.damage);
    }



}
