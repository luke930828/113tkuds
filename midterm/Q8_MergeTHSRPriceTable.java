import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] station = new String[n];
        int[][] price = new int[n][2]; // [][0]: Standard, [][1]: Business

        for (int i = 0; i < n; i++) {
            station[i] = sc.next();
            price[i][0] = sc.nextInt();
            price[i][1] = sc.nextInt();
        }

        // 輸出表頭
        System.out.println("Station|Standard|Business");

        // 輸出每一列，欄位對齊
        // 以 printf 格式化，假設站名最多三碼（可調整）
        for (int i = 0; i < n; i++) {
            // %-7s 左對齊站名，後面兩欄數字右對齊，寬度可自行調整
            System.out.printf("%-7s|%8d|%8d\n", station[i], price[i][0], price[i][1]);
        }

        sc.close();
    }
}
