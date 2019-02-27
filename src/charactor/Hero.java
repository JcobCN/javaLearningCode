package charactor;

public class Hero {
    protected String name; //姓名
    public float hp; //血量
    public float armor; //护甲
    public int moveSpeed; //移动速度

    Hero(){
    }

    Hero(String heroName){
        name = heroName;
    }

    Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed){
        this(heroName);
//        this(); //调用当前类，其他构造方法。 必须放在当前方法的第一行 且只能调用一个构造方法
        hp = heroHP;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }

    //类方法
    public static void battleWin(){
        System.out.println("hero battle win");
    }

    public String getName() {
        return name;
    }

    public void kill(Mortal m)
    {
        System.out.print(this.name + " kill ");
        m.die();
    }

    public static void main(String[] args){
        Hero ez = new Hero("ez", 100.0f, 22.0f, 200);

        ADHero ad = new ADHero();
        ez = ad; // ADHero 是 Hero的子类，可以转换成功

        AD adi = ad; //ADHero向上转型为 AD 一定成功
        adi.physicAttack();

        //是否为 Hero的子类
        System.out.println(adi instanceof Hero);

        //是否为 ADHero的子类
        System.out.println(adi instanceof ADHero);

        //是否为 AD的子类
        System.out.println(adi instanceof AD);

        //是否为 APHero的子类
        System.out.println(adi instanceof APHero);

        ADHero gailun = new ADHero();
        Hero h = gailun;
        adi = (AD)h;
//        APHero ap = (APHero)adi; //这里会出错， adi 本质是一个ADHero

        /**
         * 通过override重写/覆写 子类覆盖父类的对象方法， 达到多态
         */
        Hero garen = new Hero("garen");
        ADHero jianSheng = new ADHero("jianSheng");
        APHero teemo = new APHero("teemo");
        ADAPHero ez2 = new ADAPHero("Ez");

        garen.kill(jianSheng);
        garen.kill(teemo);
        garen.kill(ez2);

        /**
         * 隐藏 子类覆写 父类的 类方法 static
         */
        garen.battleWin();
        jianSheng.battleWin();

        garen = jianSheng;
        garen.battleWin(); //调用的是父类，类方法s

        System.out.println(garen.toString());
    }
}
