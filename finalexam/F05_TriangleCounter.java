import java.util.Scanner;

public class F05_TriangleCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入邊長總數 n：");
        int n = sc.nextInt();
        int[] lengths = new int[n];

        System.out.println("請輸入每段邊長：");
        for (int i = 0; i < n; i++) {
            lengths[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int a = lengths[i], b = lengths[j], c = lengths[k];
                    if (a + b > c && a + c > b && b + c > a) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

        sc.close();
    }
}

/*
 * Time Complexity: O(n^3)
 * 說明：三層巢狀迴圈枚舉所有邊長組合。
 */
