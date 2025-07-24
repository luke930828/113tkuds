public class isSorted {

    public static boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return true;
        }
        if (arr[index] > arr[index + 1]) {
            return false;
        }
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {1, 3, 2, 4};

        System.out.println(isSorted(test1, 0)); // 輸出 true
        System.out.println(isSorted(test2, 0)); // 輸出 false
    }
}
