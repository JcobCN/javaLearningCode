package charactor;

public class ADHero extends Hero implements AD, Mortal{

    ADHero(){
    }

    ADHero(String heroName){
        super(heroName);
    }

    public static void battleWin(){
        System.out.println("adhero battle win");
    }

    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }

    @Override
    public void die(){
        System.out.println( getName() + "ADHero died");
    }
}
