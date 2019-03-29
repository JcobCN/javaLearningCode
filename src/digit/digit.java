package digit;

import java.util.Scanner;


public class digit {
    public static void main(String[] args){
//        dataTransferExam();

//        str2numExam();
//        charExam();

        String strArray[] = new String[8];
        for (int i = 0; i < 8; i++) {
            strArray[i]  = get5CharRandString();
            System.out.printf("%d-%s%n", i, strArray[i]);
        }


        String tmp;
        for (int i = 0; i <strArray.length-1 ; i++)
            for(int j = 0; j < (strArray.length-1) - i; j++)//比较左边中最大的数，移动到右边

                //将最大值交换到最右边
                /*
                  x x x x x x Z(max)
                  x x x x x Y Z(max)
                  x x x x X Y Z(max)
                 */
                if( strArray[j].toUpperCase().toCharArray()[0] >  strArray[j+1].toUpperCase().toCharArray()[0] ) {
                    String s1 = strArray[j];
                    String s2 = strArray[j+1];
                    System.out.print(s1.toUpperCase().toCharArray()[0]);
                    System.out.print(">");
                    System.out.print(s2.toUpperCase().toCharArray()[0]);
                    System.out.println();
                    tmp = strArray[j];
                    strArray[j] = strArray[j + 1];
                    strArray[j + 1] = tmp;
                }

        for (String str : strArray)
        {
            System.out.println(str);
        }

    }

    static String get5CharRandString()
    {
        String s = "";
        short start = '0';
        short end = 'z'+1;
        for (int i = 0; i < 5; i++) {
            while(true){
                char c = (char) ( Math.random()*( end - start)+start );
                if(Character.isDigit(c) || Character.isLetter(c)){
                    s += c;
                    break;
                }
            }
        }

        return s;
    }

    static void charExam(){
        char c1 = 'a';

        //自动装箱
        Character c = c1;

        //自动拆箱
        c1 = c;

        String s1 = c.toString();
        s1 = Character.toString(c1);

        Scanner s = new Scanner(System.in);
        s1 = s.nextLine();
        char[] cs = s1.toCharArray();
        System.out.println(cs.length);

//        for (int i=0; i < cs.length; i++)
        for(char e : cs)
        {
            if( Character.isDigit(e) || Character.isUpperCase(e) )
            {
                System.out.print(e);
            }
        }


        System.out.println();

    }



    static void formatExam(){
        String name = "garen";
        String title = "Legenery";
        int kill = 8;
        System.out.printf("%s kill already %d enemies, get%s", name, kill, title);

        System.out.println("请输入地名：");
        Scanner s = new Scanner(System.in);
        String local = s.next();
//
//        System.out.println("请输入公司类型：");
//        Scanner companyType = new Scanner(System.in);
//
//        System.out.println("请输入老板名字：");
//        Scanner bossName = new Scanner(System.in);
//
//        System.out.println("请输入金额：");
//        Scanner money = new Scanner(System.in);
//
//        System.out.println("请输入产品：");
//        Scanner product = new Scanner(System.in);
//
//        System.out.println("请输入价格计量单位：");
//        Scanner unit  = new Scanner(System.in);
//
//        System.out.printf("%s最大" +
//                "%s倒闭了，"+
//                "老板%s"+
//                "拿着%s抵工资", );
        System.out.println(local);
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
