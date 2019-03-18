package charactor;

public class ADAPHero extends Hero implements AD,AP, Mortal {

    public  ADAPHero(){
    }

    ADAPHero(String heroName){
        super(heroName);
    }

    public ADAPHero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed){
        super(heroName, heroHP, heroArmor, heroMoveSpeed);
    }

    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }

    @Override
    public void die() {
        System.out.println( getName() + "ADAPHero died");
    }

    //继承的 AD, AP接口中，都有attack()默认方法，需override
    public void attack(){
        System.out.println("inherited AD AP attack()");
    }

}
