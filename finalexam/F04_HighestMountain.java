import java.util.Scanner;

public class F04_HighestMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入山峰數量 n：");
        int n = sc.nextInt();
        int[] heights = new int[n];

        System.out.println("請輸入各山峰高度：");
        for (int i = 0; i < n; i++) {
            heights[i] = sc.nextInt();
        }

        int maxHeight = heights[0];
        for (int i = 1; i < n; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
            }
        }

        System.out.println(maxHeight);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：線性搜尋最大值。
 */
