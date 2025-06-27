package Recrusion;

public class Fibonacci {

    static int n = 5;
    static int[] dp = new int[n + 1];

    public static int fibOpt(int[] dp, int n) {
        if (n <= 1) {
            dp[n] = n;
            return n;
        }
        if (dp[n] != -1)
            return dp[n];
        dp[n] = fibOpt(dp, n - 1) + fibOpt(dp, n - 2);
        return dp[n];
    }

    public static void fibForLoop(int n){
        for(int i =0;i<n;i++){
            if(i<=1)dp[i]=i;
            else{
                dp[i]=dp[i-1]+dp[i-1];
            }
        }            System.out.print("Normal For Loop : "+dp[n]);
    }
    public static void fibOn(int n){
        int  fib1=0,fib2=1,fib3=0;
        for(int i =0;i<n;i++){
            fib3=fib1+fib2;
            fib1 = fib2;
            fib2 = fib3;
        }System.out.println("\n"+"O(1)"+fib1);
    }          
   

    public static void main(String[] args) {

        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }

        System.out.println("Uptdate recrusion 2.0 Faster version : "+fibOpt(dp, n));

        fibForLoop(n);

        fibOn(n);
        

    }

}
