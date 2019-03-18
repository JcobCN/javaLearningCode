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

    public static void main(String[] args){

       //创建匿名类， 改写q方法
        Ez ezBlue = new Ez(){
            public int Q(Hero o){
                System.out.println("qqq");
                return 1;
            }
        };
        ezBlue.Q(ezBlue);
        System.out.println(ezBlue);
        new Ez().Q(ezBlue);//匿名对象，调用原来ez的Q攻击

        ezBlue.attack();//继承自默认方法
    }
}


abstract class Fps{
    String name;
    float price;


}
