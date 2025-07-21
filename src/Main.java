
public class Main {
    public static void main(String[] args) {
        // Задача 1 - Вывод целых чисел от 1 до 10
        System.out.println("Задача 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        // Задача 2 - Вывод целых чисел от 10 до 11
        System.out.println("\n\nЗадача 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        // Задача 3 - Четные числа от 0 до 17
        System.out.println("\n\nЗадача 3");
        for (int i = 0; i <= 17; i+=2) {
            System.out.print(i + " ");
        }


        // Задача 4 - Вывод чисел от 10 до -10
        System.out.println("\n\nЗадача 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }


        // Задача 5 - Високосные годы с 1904 до 2096
        System.out.println("\n\nЗадача 5");
        for (int year = 1904; year <= 2096; year+=4) {
            System.out.println(year + " год является високосным");
        }


        // Задача 6 - Последовательность чисел 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        System.out.println("\nЗадача 6");
        for (int i = 7; i <= 98; i+=7) {
            System.out.print(i + " ");
        }


        // Задача 7 - Последовательность чисел 1 2 4 8 16 32 64 128 256 512
        System.out.println("\n\nЗадача 7");
        int a = 1;
        for (int i = 0; i < 10; i++) {
            System.out.print(a + " ");
            a *= 2;
        }


        // Задача 8 - Сумма годовых накоплений
        System.out.println("\n\nЗадача 8");
        int savings = 0;                // Сохранения
        int monthlyDeposit = 29000;     // Переводы в месяц
        for (int month = 1; month <= 12; month++) {
            savings += monthlyDeposit;
            System.out.printf("Месяц %2d, сумма накоплений равна %6d рублей\n", month, savings);
        }


        // Задача 9 - Сумма годовых накоплений 12% (1% в месяц)
        System.out.println("\nЗадача 9");
        savings = 0;
        for (int month = 1; month <= 12; month++) {
            savings += monthlyDeposit;
            savings  = savings + savings/100;
            System.out.printf("Месяц %2d, сумма накоплений равна %6d рублей\n", month, savings);
        }


        // Задача 10 - Таблица умножения на 2
        System.out.println("\nЗадача 10");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + (2 * i));
        }

    }
}