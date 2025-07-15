import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] times = new int[n];
        String[] rawTimes = new String[n];

        for (int i = 0; i < n; i++) {
            String timeStr = sc.nextLine();
            rawTimes[i] = timeStr;
            times[i] = toMinutes(timeStr);
        }

        String queryStr = sc.nextLine();
        int queryTime = toMinutes(queryStr);

        int idx = binarySearch(times, queryTime);

        if (idx == n) {
            System.out.println("No train");
        } else {
            System.out.println(rawTimes[idx]);
        }
    }

    // 將 HH:mm 字串轉為總分鐘數
    private static int toMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        return h * 60 + m;
    }

    // 找第一個大於 queryTime 的索引（lower bound）
    private static int binarySearch(int[] times, int queryTime) {
        int left = 0, right = times.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (times[mid] <= queryTime) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：輸入 n 個班次後，使用二分搜尋法找第一個比查詢時間大的項目，故時間為 O(log n)。
 */
