import java.util.Scanner;

public class F06_PasswordStrengthChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入密碼：");
        String pw = sc.next();
        boolean hasUpper = false, hasLower = false, hasDigit = false;

        for (int i = 0; i < pw.length(); i++) {
            char ch = pw.charAt(i);
            if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isDigit(ch)) hasDigit = true;
        }

        if (pw.length() >= 8 && hasUpper && hasLower && hasDigit) {
            System.out.println("Strong");
        } else {
            System.out.println("Weak");
        }

        sc.close();
    }
}

/*
 * Time Complexity: O(n)
 * 說明：掃描一次密碼字串進行分類。
 */
