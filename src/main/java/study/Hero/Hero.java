package study.Hero;
import study.Item.Item;

import java.io.Serializable;
import java.util.Random;

public class Hero implements Serializable {
    public String name;
    public float hitPoiMax;
    public float magicPoiMax;
    public int hitPoint;
    public int magicPoint;
    public int speed;
    public float attackSpeed;
    public float armor;
    public float magicRival;
    public int level;
    public float physicPower;
    public float magicPower;
    public float skillDamage;
    public int skillExpend;
    public float skillCooling;
    public float rageHarm;
    public float ragePorbability;
    public int money;
    public class BattleScore {
        int kill;
        int die;
        int assit;
        public void report() {
            System.out.println("{-"+Hero.this.name+"已击杀"+kill+"人-}");
        }
    }
    public void useItem(Item item) {
        item.effect(this);
    }
    public boolean isDead() {
        if (this.hitPoint > 0) {
            return false;
        } else {
            return true;
        }
    }
    public void normalAttack(Hero underObj) {//physic power and
        float harmAdd = (float) 1.0;
        System.out.print(this.name+"对"+underObj.name+"发动了一次普通攻击");
        Random random = new Random();
        float ranNum = (float) (random.nextInt(10001));
        if ((ranNum / 10000) <= this.ragePorbability) {
            System.out.print("，触发暴击！");
            harmAdd = this.rageHarm;
        } else {
            System.out.print("\n");
        }
        int harm = underObj.ADHarm((int) (this.physicPower * harmAdd));
        try {
            underObj.impairHitPoint(harm);
        } catch (HeroHealException e) {
            System.out.println("“无效”："+e.getMessage());
//            e.printStackTrace();
        }
        System.out.print("\n");
    }

    /**
     * 计算受到的物理伤害
     * @param damage 受到的伤害值
     * @throws HeroHealException
     */
    public synchronized int ADHarm(int damage) {
        int rival = (int) (10000 / (100 + this.armor));
        int harm = (damage * rival) / 100;
        if (harm < 1)
            harm = 1;
        return harm;
    }

    //public abstract void skillOpen(Hero skillHero, Hero underHero);

    /**
     * 计算受到的魔法伤害
     * @param damage
     */
    public synchronized int APHarm(int damage) throws HeroHealException {
        int rival = (int) (this.magicRival * 0.24 + 1000 / this.magicRival); // 计算伤害减免的比例
        int harm = damage * (1 - rival / 100);
        if (harm < 1)
            harm = 1;
        return harm; // 返回伤害值
    }

    public synchronized void getHeal(Hero target, int amount) {
        target.hitPoint += amount;
        System.out.println(target.name+"回复了"+amount+"点生命值");
    }

    public void impairHitPoint(int var) throws HeroHealException {
        if (this.hitPoint <= 0) {
            throw new HeroHealException("目标已死亡");
        }
        this.hitPoint -= var;
    }
}
