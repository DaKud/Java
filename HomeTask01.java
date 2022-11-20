package Lesson1;

public class HomeTask01 {

/*
    2. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах
    от 10 до 20 (включительно), если да – вернуть true, в противном случае – false;
*/

    private static boolean between10and20(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

/*
    3. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    положительное ли число передали, или отрицательное. Замечание: ноль считаем положительным числом;
*/

    private static boolean positiveOrNegative(int num) {
        return num >= 0;
    }

/*
    4. Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true,
    если число отрицательное;
*/

    private static boolean isNegative(int number) {
        return number < 0;
    }

/*
    6. Написать метод, который определяет является ли год високосным, и выводит сообщение в консоль.
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
*/
    private static boolean isLeapYearBool(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }
/*  

    7.Задать целочисленный массив, состоящий из элементов 0 и 1. Например:
    [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. 
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;

*/
public static int[] changing01(int[] array){
    for(int i = 0; i < array.length; i++){
        array[i] = (array[i] == 0)? 1 : 0;
    }
    return array;
} 
/*  

    8.Задать пустой целочисленный массив длиной 100. 
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

*/
public static void createArr(int[] array, int step, int shift){
    for(int i = 0; i < 100; i ++){
        array[i] = shift + i * step;
    }
}
/*  9.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    пройти по нему циклом, и числа меньшие 6 умножить на 2;
*/
public static void modifierForArrayes(int[] array){
    for(int i = 0; i < array.length; i++){
        if(array[i] < 6){
            array[i] *= 2;
        }
    }
}




 public static void main(String[] args) {

        // Задание 2
        System.out.println("Задание 2.\n");

        int x = 10;
        int y = 13;
        System.out.println("Значения инициализированных переменных:");
        System.out.println("x = " + x + "; " + "y = " + y + ";");
        System.out.printf("Сумма заданных значений равна %d. ", x + y);
        System.out.printf("Метод возвращает значение %s.\n\n", between10and20(x, y));

        // Задание 3
        System.out.println("Задание 3.\n");

        int num = 32768;
        System.out.printf("Значение переменной = %d. ", num);
        System.out.printf("Число %s.\n\n", positiveOrNegative(num) ? "положительное" : "отрицательное");

        // Задание 4
        System.out.println("Задание 4.\n");

        int number = -13;
        System.out.printf("Значение переменной = %d. Метод возвращает значение %s.\n\n", number, isNegative(number));

        // Задание 6
        System.out.println("Задание 6.\n");

        System.out.println("Решение. В високосном году 366 дней, т.е. он делится на 4 без остатка. \n" +
                "Однако, по условию, необходимо проверить не делится ли без остатка год на 100.\n" +
                "Если да, то это очередное столетие и его надо проверить на делимость на 400 без остатка.\n" +
                "Если остаток от деления есть, то год является невисокосным. Например, 2300 год хоть и\n" +
                "делится на 4 без остатка, но при делении на 400 получается остаток. Значит год невисокосный.\n");

        int x1 = 2016;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x1, (isLeapYearBool(x1)) ? "\b" : "не");
        int x2 = 2018;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x2, (isLeapYearBool(x2)) ? "\b" : "не");
    }
    // Задание 7
    int[] array01 = {1, 1, 1, 0, 0, 0, 1, 0, 1, 0};
    System.out.println(Arrays.toString(changing01(array01)));

    // Задание 8
    int[] arr2 = new int[100];
        System.out.println("before:" + Arrays.toString(arr2));
        createArr(arr2, 3, 1);
        System.out.println("after: " + Arrays.toString(arr2));

   // Задание 9
   int[] arrayNumbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
   modifierForArrayes(arrayNumbers);
   System.out.println(Arrays.toString(arrayNumbers));
}