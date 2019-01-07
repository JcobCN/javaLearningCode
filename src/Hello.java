import java.util.Scanner;

public class Hello {
    public static  void main(String[] args){
        System.out.print("hello world");

        System.out.println(5 % 2);
        short s = 1; s += 1;

        int a = 3;
        int b = 4;
        int c = 5;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.printf("%d, %d\n", a, b);
        System.out.println( 2>1 ? 2:1 );
        System.out.println( 2 == 1 ? true:false );

        int max = a > b ? a:b;
        max = c > max ? c : max;

        System.out.println(max);

        /*
        //创建键盘录入对象：
        Scanner sc = new Scanner(System.in);
        //获取数据
        String str = sc.next();
        switch (str)
        {
            case "abc":
                System.out.println("f");
                break;
            case "cc":
                System.out.println("ss");
                break;

            default:
                System.out.println("ss");
                break;

        }
        */
        System.out.println( sum(a, b) );
        printMultiplicationTable();
    }

    static byte sum(byte v1, byte v2){
        byte v3 = (byte) (v1 + v2);
        return v3;
    }

   static double sum(double v1, double v2){
        return v1 + v2;
    }

    static int sum(int v1, int v2){
        return v1 + v2;
    }

    static int printMultiplicationTable(){
        int x;
        int y;

        System.out.println("adfsdf");
        wc:for(x=1; x<=9; x++){
            for(y=1; y<=x; y++){
                System.out.print(x+"*"+y+"="+x*y+"\t");
                continue wc;
            }
            System.out.println();
        }
        return 0;
    }
}
