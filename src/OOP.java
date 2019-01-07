public class OOP {
    public static void main(String[] args){
        car a =  new car();
        a.run();

        int[] arr = {9,23,134,12,1};

        System.out.println( Tools.getMax(arr) );
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
}
