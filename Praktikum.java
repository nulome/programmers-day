import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {         // вывод решения по значению true/false
            // System.out.println("Укзаанный год " + year + " будет високосный");
            System.out.println("вывод: 12.09." + year);

        } else {
           //  System.out.println("Укзаанный год " + year + " будет не високосный");
            System.out.println("вывод: 13.09." + year);
        }
    }


    public static boolean isLeapYear(int year) {
        int x = year;
        int y = year;
        int z = year;

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
