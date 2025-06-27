import java.util.Scanner;
public class SplitDigitAndAdd {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int count=0;
        for (String s:arr){
            for(char c:s.toCharArray()){
                count++;
            }
        }
        
         int sum= (count %9==0) ?9:count%9;
   
    System.out.println(sum);
}}
