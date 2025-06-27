import java.util.Scanner;
public class SwapTheLetterCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String m="";
        for(int i =0;i<s.length();i++){
            if(90>=s.charAt(i) && s.charAt(i)>=65){
                int a=(int)s.charAt(i)+32;
                m+=(char)a;
                continue;
            }
            if(123>=s.charAt(i) && s.charAt(i)>=97){
                int a=(int)s.charAt(i)-32;
                m+=(char)a;
                continue;
            }
        }
        System.out.println(m);
    }
}
