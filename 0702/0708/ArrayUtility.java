public class ArrayUtility {
    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        // 作業 1: 顯示陣列
        System.out.print("作業 1 - 陣列: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 作業 2: 反轉陣列
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        System.out.print("作業 2 - 反轉後陣列: ");
        for (int num : reversed) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 作業 3: 複製陣列
        int[] copied = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copied[i] = array[i];
        }
        System.out.print("作業 3 - 複製陣列: ");
        for (int num : copied) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 作業 4: 找到第二大元素
        int max = array[0];
        int secondMax = array[0];
        for (int num : array) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }
        System.out.println("作業 4 - 第二大元素: " + secondMax);

        // 作業 5: 檢查是否滿足條件 (無具體條件，假設檢查總和是否大於 30)
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("作業 5 - 總和大於 30: " + (sum > 30));
    }
}