import java.util.Random;
import java.util.Scanner;

public class ChikiBriki {
    final char SIGN_X = 'x';
    final char SIGN_O = 'o';
    final char SIGN_EMPTY = '.';
    char [] [] table;
    Random random;
    Scanner scanner;

    public static void main(String[] args) {
        new ChikiBriki().vDamki();
    }

    ChikiBriki() {
        random = new Random();
        scanner = new Scanner(System.in);
        table = new char[3][3];
    }

    void vDamki() {
        initTable();
        while (true) {
            turnHuman();
            if (checkWin(SIGN_X)) {
                System.out.println("Krasavela");
                break;
            }
            if (tableFull()) {
                System.out.println("Kandexay Veselee");
                break;
            }
            turnAI();
            printTable();
            if (checkWin(SIGN_O)) {
                System.out.println("Poymal Maslinu");
                break;
            }
            if (tableFull()) {
                System.out.println("Kandexay Veselee");
                break;
            }
        }
        System.out.println("Poka-Poka");
        printTable();
    }

    void initTable() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                table[row][col] = SIGN_EMPTY;
    }

    void printTable() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++)
                System.out.print(table[row][col] + " ");
            System.out.println();
        }
    }

    void turnHuman() {
        int x, o;
        do {
            System.out.println("Жми на 1,2 или 3, по одной цифре, через интер. Буквы не жми, навернётся.");
            System.out.println("И, короче, первая цифра - это строка, слева направо. Вторая - ячейка, сверху вниз. Ты - крестик.");
            System.out.println("Жми:");
            x = scanner.nextInt() - 1;
            o = scanner.nextInt() - 1;
        } while (!cellValid(x, o));
        table[o][x] = SIGN_X;
    }

    boolean cellValid(int x, int o) {
        if (x < 0 || o < 0 || x >= 3 || o >= 3)
            return false;
        return table[o][x] == SIGN_EMPTY;
    }

    void turnAI() {
        int x, o;
        do {
            x = random.nextInt(3);
            o = random.nextInt(3);
        } while (!cellValid(x, o));
        table[o][x] = SIGN_O;
    }

    boolean checkWin(char dot) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == dot && table[i][1] == dot && table[i][2] == dot) || (table[0][i] == dot && table[1][i] == dot && table [2][i] == dot))
        return true;
            if ((table[0][0] == dot && table[1][1] == dot && table[2][2] == dot) || (table[2][0] == dot && table[1][1] == dot && table[0][2] == dot))
        return true;
        return false;
    }

    boolean tableFull() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                if (table[row][col] == SIGN_EMPTY)
                    return false;
        return true;
    }
}
