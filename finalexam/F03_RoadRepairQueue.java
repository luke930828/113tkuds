import java.util.Scanner;

public class F03_RoadRepairQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入道路區段數 n：");
        int n = sc.nextInt();
        int[] repairTimes = new int[n];

        System.out.println("請輸入每段道路的修復時間：");
        for (int i = 0; i < n; i++) {
            repairTimes[i] = sc.nextInt();
        }

        int totalWait = 0;
        int currentTime = 0;
        for (int i = 0; i < n; i++) {
            totalWait += currentTime;
            currentTime += repairTimes[i];
        }

        System.out.println(totalWait);

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：單次線性迴圈，累加修復時間。
 */
