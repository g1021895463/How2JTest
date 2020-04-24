package study.Hero;

public class APHero extends Hero implements AP{
    @Override
    public int APAttack() {
        return (int) (this.skillDamage * this.magicPower);
    }
}
