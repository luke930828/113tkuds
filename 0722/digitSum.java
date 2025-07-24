public class digitSum {

    public static int digitSum(int n) {
        if (n < 10) {
            return n;
        }
        return (n % 10) + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(123));   // 輸出 6
        System.out.println(digitSum(4567));  // 輸出 22
    }
}
