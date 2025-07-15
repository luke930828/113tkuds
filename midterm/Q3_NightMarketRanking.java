import java.util.*;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(sc.nextLine());
        }

        // 選擇排序（由高到低）
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            // 交換
            double temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
        }

        // 輸出前 5 名（不足就全部列出）
        int outputCount = Math.min(5, n);
        for (int i = 0; i < outputCount; i++) {
            System.out.printf("%.1f\n", scores[i]);
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：選擇排序使用兩層迴圈，外層 n 次，內層最差 n 次，因此為 O(n^2)。
 */
