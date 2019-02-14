enum Season{
    SPRING, SUMMER, AUTUMN, WINTER
}

enum Car{
    lambo(900), tata(2), audi(50), fiat(15), honda(12);
    private int price;
    Car(int p){
        price = p;
    }

    int getPrice(){
        return price;
    }
}

public class EnumDemo {
    public static void main(String[] args){
        Season season = Season.SPRING;
        switch (season){
            case SPRING:
                System.out.println("春天");
                break;
            case AUTUMN:
                System.out.println("秋天");
                break;
            case SUMMER:
                System.out.println("夏天");
                break;
            case WINTER:
                System.out.println("冬天");
                break;
        }

        for (Season s : Season.values()){
            System.out.println(s);
        }

        for(Car c : Car.values())
            System.out.println(c + "需要" + c.getPrice() + "千美元");

    }
}
