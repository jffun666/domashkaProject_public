public class HomeWorkApp_Lesson3 {

    public static void main(String[] args) {
// первое задание
        int[] arr  = new int[6];
        arr[0] = 1;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 1;
        arr[4] = 1;
        arr[5] = 0;
        {
            for (int i = 0; i <= 1; i++) {
                System.out.println(i);
            }
            for (int i = 1; i >= 0; i--) {
                System.out.println(i);
            }
        }
// второе задание

            int[] arr2 = new int[100];
        {
            for (int a = 0; a <= arr2.length; a++) {
                System.out.print(a + " ");
            }
        }
// третье задание
             int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                 for (int b = 0; b <= arr3.length; b++) {
                     if (b < 6) {
                         b *= 2;
                         System.out.println(b);
                     }
                 }


// четвёртое задание

               int[][] arr4 = new int [2][2];
            for (int c = 0; c < arr4.length; c++) {
                arr4[c][c] = 1;
                arr4[c][arr4[c].length - 1 - c] = 1;
                System.out.print(c);
            }
// на большее меня не хватило, сейчас тяжело воспринимать информацию
// потом буду навёрстывать пробелы как время будет, в формате обязательных
// еженедельных ДЗ не успеваю встроить обучение в свою жизнь.
    }
}
