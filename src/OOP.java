public class OOP {
    public static void main(String[] args){
        car a =  new car();
        a.run();

        int[] arr = {9,23,134,12,1};

        System.out.println( Tools.getMax(arr) );
//        Tools.swap(arr, 1, 2);
//        Tools.selectorSort(arr);
        Tools.bubbleSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}

class car{
    String color;
    int num;

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
