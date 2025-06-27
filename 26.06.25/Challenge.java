import java.util.*;

public class Challenge{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        float sum=0f;
        for(int i =0;i<n;i++){
                sum+=(float)(18*sc.nextFloat());
        }
        for(int i =0;i<m;i++){
                sum+=(float)(12*sc.nextFloat());
        }

        System.out.printf("%.f",(sum));
    }
}