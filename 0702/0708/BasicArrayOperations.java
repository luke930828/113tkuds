public class BasicArrayOperations {
    public static void main(String[] args) {
        // 定義陣列
        int[] numbers = {15, 28, 7, 42, 91, 33, 66, 58, 24, 81};

        // 作業 1: 計算總和
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("作業 1 - 總和: " + sum);

        // 作業 2: 計算平均值
        double average = sum / 10.0;
        System.out.println("作業 2 - 平均值: " + average);

        // 作業 3: 索引 2 開始 3 個位置的總和
        int sumThree = numbers[2] + numbers[3] + numbers[4];
        System.out.println("作業 3 - 3 個位置總和: " + sumThree);

        // 作業 4: 將第一個元素設為 100
        numbers[0] = 100;
        System.out.println("作業 4 - 第一個元素: " + numbers[0]);

        // 作業 5: 顯示所有元素
        System.out.print("作業 5 - 所有元素: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}