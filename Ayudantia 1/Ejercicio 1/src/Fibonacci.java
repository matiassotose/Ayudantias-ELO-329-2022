public class Fibonacci {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        System.out.println(getFibonacciNumber(n));
    }

    public static int getFibonacciNumber(int n){
        if (n==0){
            return  0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
        }
    }
}
