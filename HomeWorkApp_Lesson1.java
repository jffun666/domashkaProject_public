import java.util.stream.IntStream;

public class HomeWorkApp_Lesson1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    // второе задание
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // третье задание
    public static void checkSumSign() {
        int a = 29;
        int b = 100;
        int c = a + b;

        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    // четвёртое задание
    public static void printColor() {
        int value = 1000;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value >= 1 && value <= 100)  {
            System.out.println("Жёлтый");
        }
        if (value >100) {
            System.out.println("Зелёный");
        }
    }
    // пятое задание
    public static void compareNumbers() {
        int a = 1000;
        int b = 1000;
        if (a >= b) {
            System.out.println("a>=b");
        }
        if (a < b) {
            System.out.println("a<b");
        }
    }

}
