package study.Item;

import study.Hero.Hero;

public class AttackItem extends Item {
    private final float ragePorbability;
    private final float rageHarm;
    public String name;
    public int attackSpeed;
    public int physicPower;
    public int magicPower;
    public AttackItem(String name, int attackSpeed, float ragePorbability, float rageHarm, int physicPower, int magicPower) {
        this.name = name;
        this.attackSpeed = attackSpeed;
        this.physicPower = physicPower;
        this.ragePorbability = ragePorbability;
        this.magicPower = magicPower;
        this.rageHarm = rageHarm;
    }
    @Override
    public void effect(Hero hero) {
        hero.attackSpeed += this.attackSpeed;
        hero.physicPower += this.physicPower;
        hero.magicPower += this.magicPower;
        hero.rageHarm += this.rageHarm;
        hero.ragePorbability += this.ragePorbability;
        System.out.println(hero.name+"装备了"+this.name);
    }
}
