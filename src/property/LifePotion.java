package property;

public class LifePotion extends Item {
    public void effect(){
        System.out.println("血瓶使用后，+50hp");
    }

    public void buy(){
        System.out.println("购买血瓶");
    }
}
