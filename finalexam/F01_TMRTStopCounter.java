import java.util.Scanner;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入停靠站數量 n：");
        int n = sc.nextInt();
        String[] stops = new String[n];
        System.out.println("請輸入各站代碼：");
        for (int i = 0; i < n; i++) {
            stops[i] = sc.next();
        }

        System.out.print("請輸入起站與訖站：");
        String start = sc.next();
        String end = sc.next();

        int startIndex = -1, endIndex = -1;
        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) startIndex = i;
            if (stops[i].equals(end)) endIndex = i;
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(endIndex - startIndex) + 1);
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：需要掃描陣列一次來找到起點與終點的索引。
 */
