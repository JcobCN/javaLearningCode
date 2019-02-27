package property;

public class MagicPotion extends  Item{
    public void effect(){
        System.out.println("蓝瓶使用后，可以恢复mp");
    }

    @Override
    public void buy() {
        System.out.println("购买蓝瓶");
    }
}
