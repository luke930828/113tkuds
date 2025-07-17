import java.util.Scanner;

public class TicTacToe5x5 {
    private static final int SIZE = 5;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printBoard();
            int row, col;
            while (true) {
                System.out.print("請輸入 " + currentPlayer + " 的座標 (row col, 0-4): ");
                row = scanner.nextInt();
                col = scanner.nextInt();

                if (row < 0 || row >= SIZE || col < 0 || col >= SIZE || board[row][col] != '.') {
                    System.out.println("錯誤：座標超界或位置已被佔用，請重新輸入！");
                    continue;
                }
                break;
            }

            board[row][col] = currentPlayer;
            System.out.println("玩家 " + currentPlayer + " 在位置 (" + row + ", " + col + ") 放置棋子");

            if (checkWin(row, col)) {
                printBoard();
                System.out.println("玩家 " + currentPlayer + " 獲勝！");
                break;
            }

            if (isBoardFull()) {
                printBoard();
                System.out.println("平手！");
                break;
            }

            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
        scanner.close();
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = '.';
            }
        }
    }

    private static void printBoard() {
        System.out.println("\n=== 5x5 井字遊戲 ===");
        System.out.print("  ");
        for (int j = 0; j < SIZE; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkWin(int row, int col) {
        char player = board[row][col];
        int count;

        // 檢查行
        count = 0;
        for (int j = 0; j < SIZE; j++) {
            if (board[row][j] == player) count++;
            else count = 0;
            if (count == 5) return true;
        }

        // 檢查列
        count = 0;
        for (int i = 0; i < SIZE; i++) {
            if (board[i][col] == player) count++;
            else count = 0;
            if (count == 5) return true;
        }

        // 檢查主對角線 (左上到右下)
        count = 0;
        for (int i = 0; i < SIZE; i++) {
            int j = i - row + col;
            if (j >= 0 && j < SIZE && board[i][j] == player) count++;
            else count = 0;
            if (count == 5) return true;
        }

        // 檢查反對角線 (右上到左下)
        count = 0;
        for (int i = 0; i < SIZE; i++) {
            int j = col - (i - row);
            if (j >= 0 && j < SIZE && board[i][j] == player) count++;
            else count = 0;
            if (count == 5) return true;
        }

        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == '.') return false;
            }
        }
        return true;
    }
}