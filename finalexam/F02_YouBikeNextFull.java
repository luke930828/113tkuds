import java.util.Scanner;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入總站數 n：");
        int n = sc.nextInt();
        int[] bikes = new int[n];

        System.out.println("請輸入每站的可借車輛數：");
        for (int i = 0; i < n; i++) {
            bikes[i] = sc.nextInt();
        }

        System.out.print("請輸入目前所在站位置：");
        int pos = sc.nextInt();

        boolean found = false;
        for (int i = pos + 1; i < n; i++) {
            if (bikes[i] == 0) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println("OK");

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：最壞情況下須從目前位置掃描到陣列尾端。
 */
