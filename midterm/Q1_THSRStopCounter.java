import java.util.*;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] stations = sc.nextLine().split(" ");
        String[] se = sc.nextLine().split(" ");
        String start = se[0];
        String end = se[1];

        int startIdx = -1;
        int endIdx = -1;

        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) {
                startIdx = i;
            }
            if (stations[i].equals(end)) {
                endIdx = i;
            }
        }

        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIdx - endIdx) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需一次走訪長度為 n 的站名陣列來尋找起點與終點索引，屬於線性時間。
 */
