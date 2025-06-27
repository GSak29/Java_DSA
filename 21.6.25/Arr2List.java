import java.util.*;
public class Arr2List {
    public static void main(String[] args){
        List<Integer> li = new ArrayList<>();
        int[] a = new int[10];
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        for(int i:a){
            li.add(i);
        }
        System.out.println(li);
    }
}
