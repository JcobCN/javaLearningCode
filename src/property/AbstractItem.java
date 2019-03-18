package property;

public abstract class AbstractItem {
    public abstract boolean disposable();
    public void hello(){
        System.out.println("hello");
    }

    public static void main(String[] main){
        AbstractItem i1 = new AbstractItem() {//匿名类
            @Override
            public boolean disposable() {
                System.out.println("233");
                return false;
            }
        };

        i1.disposable();
    }
}
