import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {         // вывод решения по значению true/false
            System.out.println("Укзаанный год " + year + " будет високосный");

        } else {
            System.out.println("Укзаанный год " + year + " будет не високосный");
        }
    }

    public static boolean isLeapYear(int year) {
        while (year <= 0) {  // первая проверка на кратность 400
            if (year == 0) {
                return true;
            }
            year = year - 400;
        }

        while (year <= 0) {  // вторая проверка на кратность 100
            if (year == 0) {
                return false;
            }
            year = year - 100;
        }

        while (year <= 0) {  // третья проверка на кратность 4
            if (year == 0) {
                return true;
            }
            year = year - 4;
        }
        return false;
    }
}
