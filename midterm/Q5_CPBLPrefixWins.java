import java.util.Scanner;

public class Q5_CPBLPrefixWins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        // 建立前綴和陣列 ps，大小 n+1，ps[0]=0
        int[] ps = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            ps[i] = ps[i - 1] + a[i - 1];
        }

        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println();

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：建立前綴和陣列需走訪 n 次，之後輸出前 k 筆為 O(k)，k ≤ n，整體為 O(n)。
 */
