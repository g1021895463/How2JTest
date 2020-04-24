package study.Item;

import study.Hero.Hero;

public class DefenceItem extends Item {
    public String name;
    public int hitPoiMax;
    public int magicPoiMax;
    public int armor;
    public int magicRival;
    public DefenceItem(String name, int hitPoiMax, int magicPoiMax, int armor, int magicRival) {
        this.name = name;
        this.hitPoiMax = hitPoiMax;
        this.magicPoiMax = magicPoiMax;
        this.armor = armor;
        this.magicRival = magicRival;
    }
    @Override
    public void effect(Hero hero) {
        hero.hitPoiMax += this.hitPoiMax;
        hero.magicPoiMax += this.magicPoiMax;
        hero.armor += this.armor;
        hero.magicRival += this.magicRival;
        System.out.println(hero.name+"装备了"+this.name);
    }
}
