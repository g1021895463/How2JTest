package study.Item;

import study.Hero.Hero;

public class ExpendItem extends Item {
    public String name;
    public int hitPoint;
    public int magicPoint;
    public ExpendItem(String name, int hitPoint, int magicPoint) {
        this.hitPoint = hitPoint;
        this.name = name;
        this.magicPoint = magicPoint;
    }
    @Override
    public void effect(Hero hero) {
        hero.hitPoint += this.hitPoint;
        hero.magicPoint += this.magicPoint;
        System.out.println(hero.name+"装备了"+this.name);
    }
}
