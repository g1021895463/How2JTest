package study.Hero;

public class HealHero extends Hero implements Treament {

    @Override
    public int treamentHeal(HealHero healer) {
        return (int) healer.magicPower;
    }
}
