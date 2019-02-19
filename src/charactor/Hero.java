package charactor;

public class Hero {
    protected String name; //姓名
    public float hp; //血量
    public float armor; //护甲
    public int moveSpeed; //移动速度

    Hero(){
    }

    Hero(String heroName, float heroHP, float heroArmor, int heroMoveSpeed){
        name = heroName;
        hp = heroHP;
        armor = heroArmor;
        moveSpeed = heroMoveSpeed;
    }

    public static void main(String[] args){
        Hero ez = new Hero("ez", 100.0f, 22.0f, 200);
    }
}
