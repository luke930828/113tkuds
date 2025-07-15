import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }

        // 計算評分為5的攤位數量
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("None");
        } else {
            // 建立陣列存放符合條件的索引
            int[] indices = new int[count];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (scores[i] == 5) {
                    indices[idx++] = i;
                }
            }

            // 輸出索引，用空格分隔
            for (int i = 0; i < count; i++) {
                System.out.print(indices[i]);
                if (i != count - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}

