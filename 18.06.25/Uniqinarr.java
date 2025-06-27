import java.util.Scanner;

public class Uniqinarr {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[sc.nextInt()];
        
        int len=arr.length;
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[10];
        for(int j=0;j<len;j++){
                int lenn=(int)Math.log10(arr[j])+1;
                int n = arr[j];
                int[] a = new int[lenn];
                
                for(int i =0;i<lenn;i++){
                    a[i]=n%10;
                    n/=10;
                    freq[a[i]]++;
                    
                }
               
                
            }
             for(int i=0;i<9;i++){
                   if(freq[i]!=0) System.out.println(i+" occurs "+freq[i]+" times");
                }
        
    }
}
