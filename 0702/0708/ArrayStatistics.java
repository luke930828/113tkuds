public class ArrayStatistics {
    public static void main(String[] args) {
        int[] numbers = {15, 28, 7, 42, 91, 33, 66, 58, 24, 81};

        // 計算總和
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        System.out.println("總和: " + total);

        // 計算平均值
        double average = total / 10.0;
        System.out.println("平均值: " + average);

        // 計算中位數
        int[] sorted = numbers.clone();
        for (int i = 0; i < sorted.length - 1; i++) {
            for (int j = 0; j < sorted.length - i - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }
        double median = sorted.length % 2 == 0 ? (sorted[4] + sorted[5]) / 2.0 : sorted[5];
        System.out.println("中位數: " + median);

        // 計算眾數 (簡單實現，假設唯一出現最多)
        int maxCount = 0;
        int mode = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) count++;
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }
        System.out.println("眾數: " + mode);

        // 計算頻率分佈 (簡單列出每個元素出現次數)
        System.out.print("頻率分佈: ");
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (numbers[j] == numbers[i]) count++;
            }
            if (count == 1) System.out.print(numbers[i] + "(" + count + ") ");
        }
        System.out.println();
    }
}