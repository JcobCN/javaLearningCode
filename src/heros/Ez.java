package heros;

import charactor.*;



public class Ez extends ADAPHero {

    public Ez(){}

    public  Ez(String heroName, float heroHP, float heroArmor, int heroMoveSpeed){
        super(heroName, heroHP, heroArmor, heroMoveSpeed);
    }

    public int Q(Hero target){

        magicAttack();
        physicAttack();
        System.out.println( name + "使用Q，对" + target.getName() + "造成5点伤害");
        return 0;
    }
}
