package heros;

import charactor.*;



public class Ez extends ADAPHero {
    public int Q(Hero target){

        magicAttack();
        physicAttack();
        System.out.println("使用Q，对" + target.name);
        return 0;
    }
}
