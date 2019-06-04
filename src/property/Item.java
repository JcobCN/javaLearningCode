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

    public String toString(){
        return name + price;
    }

    public void finalize(){
        System.out.println("当前对象正在被回收");
    }

    public boolean equals(Object o){

        if( o instanceof Item ) {
            return this.price == ((Item) o).price;
        }

        return false;
    }

    public static void main(String[] args){
        Item i = new Item();
        i.effect();

        LifePotion hp50 = new LifePotion();
        hp50.name = " hp50";
        hp50.price = 233;
        hp50.buy();
        hp50.effect();

        MagicPotion mp50 = new MagicPotion();
        mp50.buy();
        mp50.effect();


        System.out.println(hp50.toString());
        System.out.println(hp50.equals(mp50) );
    }
}
