import  java.util.Scanner;


public class MethodTest {
    public static void main(String[] args){
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);

        //获取键盘录入数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();

        //调用方法
        int max = getMax(a, b);
        System.out.println("大的值是："+max);

        int c = sc.nextInt();
        printMultiplicationTable(c);
    }

    static int getMax(int a, int b){
        return a>b?a:b;
    }

    static void printMultiplicationTable(int n){
        int x = 0;
        int y = 0;

        for(x=1; x<=n; x++){
            for(y=1; y<=x; y++){
                System.out.print(x+"*"+y+"="+x*y+"\t");
            }
            System.out.println();
        }
    }
}
