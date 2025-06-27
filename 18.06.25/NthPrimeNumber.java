import java.util.Scanner;
public class NthPrimeNumber {
    public static void main(String[] args){
        int i =0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ans=0,flag=0;
        for(int j=2;i<n;j++)
        {
            flag=0;
            for(int k=2;k<j;k++)
            {
                if(j%k==0){flag=1;break;}
            }
            if(flag==1)
                continue;
            ans = j;
            i++;
        }
        System.out.println(ans);
        s.close();
    }
}
