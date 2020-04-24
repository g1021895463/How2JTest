package study.Hero;

public class ADHero extends Hero implements AD {
    @Override
    public int ADAttack() {//只需要算出伤害
        return (int) (this.physicPower * this.skillDamage);
    }

}
