import java.util.Scanner;

public class NumberOfCarries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] ar = a.toCharArray();
        char[] br = b.toCharArray();
        int max = Math.max(a.length(), b.length());
        int count = 0, rem = 0;
        for (int i = 0; i < max; i++) {
            if (((int) ar[max - i - 1] + ((int) br[max - i - 1]) + (int) rem - 48) - 48 > 9) {
                 count++;
                rem = 1;
            } else {
                rem = 0;
            }
        }
        System.out.println(count);

    }
}