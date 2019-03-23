package digit;

public class MathCalculate {
    public static void main(String[] args){
        float f1 = 5.4f;
        float f2 = 5.5f;
        //四舍五入
        System.out.println(Math.round(f1));
        System.out.println(Math.round(f2));

        //得到一个随机0<=x<1之间的随机浮点数
        System.out.println(Math.random());

        //得到一个随机0<=x<10之间的随机整数
        System.out.println((int) (Math.random()*10) );

        //开放sqrt
        System.out.println(Math.sqrt(9));

        //次方pow，幂
        System.out.println(Math.pow(2,4));

        //π
        System.out.println(Math.PI);

        //自然常数 e
        System.out.println(Math.E);

        int n = Integer.MAX_VALUE;
        double e = Math.pow( (1 + 1d/n) , n);
        System.out.println(e);

        //质数判断，
        // 因为如果它不是质数，
        // 那么它一定可以表示成两个数（除了1和它本身）相乘，
        // 这两个数必然有一个小于等于它的平方根。
        // 只要找到小于或等于的那个就行了
        int sum = 0;
        int isNotPrime = 0;
        for(int i=2; i<1000*10000; i++)
        {
            isNotPrime = 0;
            for(int j= 2; j <= Math.sqrt(i); j++){
                if(i%j == 0){
                    isNotPrime = 1;
                    break;
                }
            }
            if(isNotPrime == 0)
                sum++;
        }

        System.out.println(sum);
    }
}
