import java.util.Scanner;
public class Uniqdig {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lenn= (int)Math.log10(n)+1;
        int[] a = new int[lenn];
                int freq[]=new int[10];
        for(int i =0;i<lenn;i++){
            a[i]=n%10;
            n/=10;
            freq[a[i]]++;
            
        }
         int c=0;
        for(int i=0;i<9;i++){
            if(freq[i]!=0)c++;

        }
        System.out.println(c);
    }
}
