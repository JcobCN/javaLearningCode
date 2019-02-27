package property;

public class Item {
    String name;
    int price;

    public void effect(){
        System.out.println("物品使用后，可以有效果");
    }

    public void buy () {
        System.out.println("购买");
    }

    public static void main(String[] args){
        Item i = new Item();
        i.effect();

        LifePotion hp50 = new LifePotion();
        hp50.buy();
        hp50.effect();

        MagicPotion mp50 = new MagicPotion();
        mp50.buy();
        mp50.effect();
    }
}
