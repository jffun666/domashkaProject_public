import java.security.PublicKey;

public class HomeWorkApp_Lesson2 {

    public static void main (String[] args) {

        firstTask (8, 3);
        secondTask(-9);
        thirdTask(67);


    }
// первое задание
    public static boolean firstTask (int a, int b) {

        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        } else {
            return false;
        }
    }
// второе задание
    public static void secondTask(int c) {

        if (c >= 0) {
            System.out.println("Число положительное");
        }

        else { System.out.println("Число отрицательное");
        }
    }

    // третье задание
    public static boolean thirdTask (int d) {

        if (d >= 0) {
            return false;
        }
        else {
            return true;
        }
    }

    // четврёртое задание!!!!! КАК ПЕРЕДАТЬ String? Какой синтаксис? Я не разобрался, поэтому внутри самого метода прописал переменные.
    // и я не понимаю почему цикл не работает, я устал. Не судите строго.
    public static void fourthTask() {
        int e = 100;

        for (e = 110; e == 200; e++) {
            System.out.println("e = " + e);
        }
        System.out.println("end");

    }

}





