package property;

public class Weapon extends AbstractItem {

    @Override
    public boolean disposable() {
        return false;
    }

    public static void main(String args[]){
        Weapon exCliba = new Weapon();
        exCliba.hello();
        System.out.println(exCliba.disposable());
    }
}
