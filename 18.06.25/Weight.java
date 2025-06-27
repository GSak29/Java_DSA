import java.util.Scanner;
public class Weight {
    public static void main(String[]  args){
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine().toLowerCase();
        char[] c= str.toCharArray();
        int a= 0;
        int sum=0;
        for(int i=0;i<c.length;i++){a=0;
          if(c[i]>'a' && c[i]<'z'){  if( c[i]== 'a' || c[i]== 'e' || c[i]== 'i' || c[i]== 'o' || c[i]== 'u' ){
                if(option == 0 ) a=0;
                else a=(int)c[i]-96; 
                sum+=a;
                continue;
            }
            sum+=(int)(c[i] -96);
        }
        }System.out.println(sum);
    }
}
