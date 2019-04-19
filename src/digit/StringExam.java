package digit;

import java.util.Scanner;

public class StringExam {

    public static  void main(String []args){


//        String outS = new String();
//        String passwd = getRandString(90000);
//        crackPasswd(passwd, outS, 0);
//        crackPasswd(passwd, outS);
    }

    /**
     *  循环方式
     * @param passwd input password string.
     * @param outStr result string.
     */
    static void crackPasswd(String passwd, String outStr){
        char []sArray = passwd.toCharArray();

        for (char tmpc:sArray){
            char c = '0';
            for(; c <= 'z'; c++){
                if( !(Character.isLetter(c) || Character.isDigit(c))  )
                    continue;
                if (c == tmpc){
                    outStr += c;
                    break;
                }
            }
        }
        System.out.println(outStr);

    }

    /**
     * 递归方式
     @param passwd input the password string.
     @param outStr result string
     @param num start Character num
     */
    static void crackPasswd(String passwd, String outStr, int num){

        int len = passwd.length();
        char c = '0';
        for(; c <= 'z'; c++)
        {
            if( Character.isLetter(c) || Character.isDigit(c) )
                if( passwd.toCharArray()[num] == c ){
                    outStr += c;
                    break;
                }
        }


        if(num == len-1) {
            System.out.println(passwd);
            System.out.println(outStr);
            return;
        }

        crackPasswd(passwd, outStr, num+1);
    }


    static String get5CharRandString()
    {
        return getRandString(5);
    }

    static String getRandString(int strLen)
    {
        String s = "";
        short start = '0';
        short end = 'z'+1;
        for (int i = 0; i < strLen; i++) {
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

    static void examStringCaseSort(){
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
}
