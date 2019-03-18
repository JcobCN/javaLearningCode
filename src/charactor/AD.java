package charactor;

public interface AD {
    public void physicAttack();

    //默认方法，需要用default修饰
    default void attack(){
        System.out.println("thist is the default ad attack()");
    }
}
