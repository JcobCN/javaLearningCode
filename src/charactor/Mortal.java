package charactor;

public interface Mortal {
     void die();
     default void reserve(){
         System.out.println("The hero is reserved");
     }
}
