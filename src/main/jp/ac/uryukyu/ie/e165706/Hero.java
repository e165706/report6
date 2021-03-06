package jp.ac.uryukyu.ie.e165706;

public class Hero extends LivingThing {
    public Hero(String name, int hitPoint, int attack) {
        super(name, hitPoint, attack); // 必ず先頭で呼び出す
    }

    @Override
    public int attack_option(int damage, LivingThing opponent) {
        if (damage == 0) {
            System.out.printf("%sの攻撃！...だが、%sは攻撃を回避した！\n", getName(), opponent.getName());
        }
        else{
            double hit =Math.random() *10*10;
            if (hit >= 70){
                damage = damage *2;
                System.out.printf("%sの攻撃！会心の一撃！！%sに%sのダメージを与えた！！\n",getName(),opponent.getName(),damage);
            }
            else{
                System.out.printf("%sに%dのダメージを与えた！！\n", opponent.getName(), damage);
            }
        }
        return damage;
    }
}
