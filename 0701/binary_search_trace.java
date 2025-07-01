import java.util.Scanner;

public class binary_search_trace{
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要搜尋的數字：");
        int target = scanner.nextInt();
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            System.out.printf("搜尋範圍：left = %d, right = %d, mid = %d → arr[mid] = %d%n", left, right, mid, arr[mid]);
            if (arr[mid] == target) {
                System.out.println("結果：已找到！");
                scanner.close();
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("結果：未找到！");
        scanner.close();
    }
}