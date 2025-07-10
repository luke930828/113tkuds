public class ArraySearcher {
    public static void main(String[] args) {
        int[] array = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        // 作業 1: 顯示陣列
        System.out.print("作業 1 - 陣列: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        // 作業 2: 查找目標元素 67
        int target = 67;
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("作業 2 - 目標 " + target + " 的索引: " + index);

        // 作業 3: 從後向前查找目標元素 91
        target = 91;
        index = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println("作業 3 - 從後向前找 " + target + " 的索引: " + index);

        // 作業 4: 計算目標元素 34 出現次數
        target = 34;
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        System.out.println("作業 4 - 目標 " + target + " 出現次數: " + count);

        // 作業 5: 檢查成績是否在 67 到 100 之間
        int passCount = 0;
        for (int num : array) {
            if (num >= 67 && num <= 100) {
                passCount++;
            }
        }
        System.out.println("作業 5 - 在 67 到 100 之間的數量: " + passCount);
    }
}