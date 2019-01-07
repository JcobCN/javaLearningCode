
public class Reload {
    public  static void main(String[] args){
        byte a = 4;
        byte b = 5;
        System.out.println( compare(a, b) );
    }

    static boolean compare(byte a, byte b){
        return a == b;
    }

    static boolean compare(long a, long b){
        return a == b;
    }
}
