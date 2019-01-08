public class Array {
    public static  void main(String[] args){

        //静态初始化, 不指定长度，同时赋值
        int[] staticInit = {0, 1,3};
        int[] arr2 = new int[]{0, 1,3};
        //动态初始化, 指定长度
        int[] arr = new int[3];

        System.out.println(arr);
        System.out.println(arr[0]);

        int[][] money = {{22,66,44}, {77,33,88}, {25,45,65}, {11,66,99}};
        test(money);

        int a = 10;
        int b = 20;

        change(a, b);
        System.out.println("org a:"+a+",b:"+b);

        int num = 123456;
        code(num);

        Tools.selectorSort(money[0]);
        for (int i = 0; i <money[0].length ; i++) {
            System.out.println(money[0][i]);
        }

    }

    static void test(int[][] arr)
    {
        int sum = 0;
        System.out.println(arr.length);

        int x = 0;
        int y = 0;

        for(x=0; x<arr.length; x++){
            for(y=0; y<arr[x].length; y++){
                sum += arr[x][y];
            }
        }

        System.out.println(sum);
    }

    static void change(int a, int b){
        a = b;
        b = a + b;
        System.out.println("a:"+a+",b:"+b);
    }

    static void code(int num){
        int[] arr = new int[8];

        int index = 0;
        while(num > 0){
            arr[index] = num%10;
            num /= 10;
            index++;
        }


    }
}
