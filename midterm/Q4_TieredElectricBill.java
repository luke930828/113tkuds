import java.util.Scanner;

public class Q4_TieredElectricBill {

    // 計算單筆用電度數的費用，四捨五入回傳整數
    public static int calc(int kWh) {
        double bill = 0;
        int remain = kWh;

        if (remain > 1000) {
            bill += (remain - 1000) * 8.46;
            remain = 1000;
        }
        if (remain > 700) {
            bill += (remain - 700) * 6.24;
            remain = 700;
        }
        if (remain > 500) {
            bill += (remain - 500) * 5.04;
            remain = 500;
        }
        if (remain > 330) {
            bill += (remain - 330) * 3.70;
            remain = 330;
        }
        if (remain > 120) {
            bill += (remain - 120) * 2.45;
            remain = 120;
        }
        if (remain > 0) {
            bill += remain * 1.68;
        }

        return (int) Math.round(bill);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bills = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            int kWh = sc.nextInt();
            bills[i] = calc(kWh);
            total += bills[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Bill: $" + bills[i]);
        }
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + (int) Math.round((double) total / n));

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：主程式中對 n 筆用電度數各執行一次 calc 方法，calc 的計算流程是固定步驟，與 kWh 大小無關，故為 O(1)。總計為 O(n)。
 */
