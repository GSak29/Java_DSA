public class Recrusion {
    int i;
    public static int fact(int a) {
        if (a == 1) {
            return a;
        } else {
            return a * fact(a - 1);
        }

    }

    public static int fib(int a){
        if(a<=1){
            return a;
            }else{
                return fib(a-1)+fib(a-2);
            }
        }
    

    public static int sum(int a) {
        if (a == 0) {
            return a;
        } else {
            return a + sum(a - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 5 is " + fact(5));
        System.out.println("Sum of first 5 num is " + sum(5));
        System.out.println("the 5th fabi num is " + fib(5));

    }
}
