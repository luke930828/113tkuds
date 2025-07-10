public class GradeProcessor {
    public static void main(String[] args) {
        int[] scores = {15, 28, 7, 42, 91, 33, 66, 58, 24, 81};

        int total = 0;
        for (int score : scores) {
            total += score;
        }
        System.out.println("作業 1 - 總分: " + total);

        double average = total / 10.0;
        System.out.println("作業 2 - 平均分: " + average);

        int sumThree = scores[2] + scores[3] + scores[4];
        System.out.println("作業 3 - 索引 2 開始 3 個成績總分: " + sumThree);

        scores[0] = 100;
        System.out.println("作業 4 - 第一個成績設為 100: " + scores[0]);

        System.out.print("作業 5 - 所有成績: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();

        int maxScore = scores[0];
        int minScore = scores[0];
        for (int score : scores) {
            if (score > maxScore) maxScore = score;
            if (score < minScore) minScore = score;
        }
        System.out.println("額外 - 最高分: " + maxScore);
        System.out.println("額外 - 最低分: " + minScore);

        int passCount = 0;
        for (int score : scores) {
            if (score >= 60) passCount++;
        }
        double passRate = (passCount / 10.0) * 100;
        System.out.println("額外 - 通過率: " + passRate + "%");
    }
}
