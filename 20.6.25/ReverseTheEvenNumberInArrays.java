import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[n - i - 1] = a[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                a[i] = b[i];
            }
        }
        for (int i : a) {
            System.out.print(i);
        }
    }
}
