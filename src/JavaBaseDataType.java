
public class JavaBaseDataType {
    public static void main(String []args){
        //byte
        System.out.println("基本类型:byte 二进制位数: " + Byte.SIZE);
        System.out.println("包装类： java.lang.Byte ");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        //short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类： java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        //int
        System.out.println();
        int i = 5555;
        byte b = (byte)i;
        System.out.println(b);
        System.out.printf("%#x, %#x\n", i, b);

        float c = 1.2f;
        int a = (int)c;
        System.out.println(a);
        System.out.println(c);

        //强制初始化局部变量
        int age = 2;
        System.out.println("age= "+ age);

        Test test = new Test();
        test.pupAge();

    }
}

class Test{
    final static int bee = 3;
    void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println(age);
    }
}
