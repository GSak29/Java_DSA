package Recrusion;

import java.util.*;

public class MinJump {
    static int jump = 0;

    public static int minJump(int[] a, int n) {
        int[] jumps = new int[100];
        Arrays.fill(jumps, 7);
        jumps[0] = 0;
        int jump = 1, k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= a[i] + i; j++) {
                jumps[j] = Math.min(jumps[j], jumps[i] + 1);

            }
        }

        return jumps[n];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println(minJump(a, n));

    }

}
