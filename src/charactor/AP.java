package charactor;

public interface AP {
    public void magicAttack();
    default void attack(){
        System.out.println("this is default ap attack()");
    }
}
