package study.Item;

import study.Hero.Hero;

public abstract class Item {
    public String name;
    public int hitPoiMax;
    public int hitPoint;
    public int magicPoint;
    public int physicPower;
    public int magicPower;
    public int armor;
    public int magicRival;
    public int price;

    public abstract void effect(Hero hero);
}
