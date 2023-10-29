import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {         // вывод решения по значению true/false
            // System.out.println("Указанный год " + year + " будет високосный");
            System.out.println("вывод: 12.09." + year); /** По условию задачи нужно делать вывод в формате "12.09.2000",
             слово "вывод" выводить не нужно*/

        } else {
           //  System.out.println("Указанный год " + year + " будет не високосный");
            System.out.println("вывод: 13.09." + year);
        }
    }


    public static boolean isLeapYear(int year) {
        int x = year; /** Названия переменных лучше придумывать "говорящими"*/
        int y = year;
        int z = year;

        /** Можно вместо цикла while использовать цикл for, тогда вообще не нужно будет объявлять и не придумывать
        названия переменным x,y,z

        for (int i = year; i >= 0; i -= 400) { // i -= 400 это сокращённое написание i = i - 400
            if (i == 0) {
                return true;
            }
        }
        */

        while (x >= 0) {  // первая проверка на кратность 400
            if (x == 0) {
                return true;
            }
            x = x - 400;
        }

        while (y >= 0) {  // вторая проверка на кратность 100
            if (y == 0) {
                return false;
            }
            y = y - 100;
        }

        while (z >= 0) {  // третья проверка на кратность 4
            if (z == 0) {
                return true;
            }
            z = z - 4;
        }
        return false;
    }

}
