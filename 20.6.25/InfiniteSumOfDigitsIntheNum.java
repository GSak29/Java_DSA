import java.util.Scanner;

class InfiniteSumOfDigitsIntheNum{
    
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();

    int c = a,sum=0;
while(c>9){
       c = (a%9)!=0 ? a%9 : 9;
       sum+=c;
    }
       System.out.println("The sum of the digits till 1 digit is: "+sum);
        sc.close();
}
}