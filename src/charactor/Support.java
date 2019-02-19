package charactor;

public class Support extends Hero implements Healer {

    @Override
    public void heal() {
        System.out.println("正在治疗");
    }

}
