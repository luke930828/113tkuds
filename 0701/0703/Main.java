import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = ((n + n) + (n * 5));
        System.out.println(result);
        scanner.close();
    }
}
