package jp.ac.uryukyu.ie.e165706;

public class Hero extends LivingThing{
    public Hero(String name,int hitPoint,int attack){
        super(name,hitPoint,attack); // 必ず先頭で呼び出す
    }
}
