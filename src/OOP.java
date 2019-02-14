public class OOP {
    public static void main(String[] args){
        car a =  new car();
        int[] arr = {9,23,134,12,1};

        System.out.println( Tools.getMax(arr) );
//        Tools.swap(arr, 1, 2);
//        Tools.selectorSort(arr);
        Tools.bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        Single s1 = Single.getInstance();
    }
}

class car{
    String color;
    int num;

    static {
        System.out.println("static constrator");
    }

    void run(){
        System.out.println(num+"..."+color);
    }
}

class Tools {
    public static int getMax(int[] arr){
        int max = 0;
        for (int i = 0; i <arr.length; i++) {
            max = arr[i]>max?arr[i]:max;
        }

        return max;
    }

    //选择排序
    public static int selectorSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i+1; j <arr.length; j++) {
                 if(arr[i] > arr[j] == true){
                     swap(arr, i, j);
                 }
            }
        }
        return 0;
    }

    //冒泡排序
    public static int bubbleSort(int[] arr){
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if(arr[j] > arr[j+1] == true){
                    swap(arr, j, j+1);
                }
            }

        }
        return 0;
    }


    public static void swap(int[] arr, int a1, int a2){
        arr[a1] = arr[a1] ^ arr[a2];
        arr[a2] = arr[a1] ^ arr[a2];
        arr[a1] = arr[a1] ^ arr[a2];
    }
}

//单实例
/**
 这个是先初始化对象
 称为：俄汉式
*/
class Single{
    private static Single s = new Single();
    private Single(){};
    public static Single getInstance(){
        return s;
    }
}

//单实例2

/**
 *
 这个是后初始化对象
 称为：懒汉式
 */
class Single1{
    private static Single1 s = null;
    private Single1(){};
    public static Single1 getInstance(){
        if(s == null)
            s = new Single1();
        return s;
    }
}

