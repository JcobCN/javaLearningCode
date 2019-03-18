package digit;

public class digit {
    public static void main(String[] args){
//        dataTransferExam();

        str2numExam();
    }

    static void str2numExam(){
        int i = 5;

        //方法1，调用String静态方法valueOf
        String str = String.valueOf(i);

        //方法2， 调用Integer.toString
        Integer i1 = i;
        i1.toString();

        //字符串转int
        int i2 = Integer.parseInt("999");

        Float f1 = 3.14f;
        System.out.println(f1.toString());
        System.out.println(Float.parseFloat("3.14"));
//        System.out.println(Float.parseFloat("3.1a4"));

    }

    static void dataTransferExam(){
        byte b1 = 3;
        //基本类型转换成封装
        Byte b2 = new Byte(b1);
        //= 自动转换成类类型， 叫装箱
        Byte b3 = b1;
        //= 自动转换成 基本类型叫拆箱
        byte b4 = b3;

        short s1 = 1;
        Short s2 = s1;
        short s3 = s2;

        float f1 = 1.0f;
        Float f2 = f1;
        float f3 = f2;

        double d1 = 1.0;
        Double d2 = d1;
        double d3 = d2;

        int i1 = b3;
        Integer i3 = 1;
        b3.toString();

    }
}
