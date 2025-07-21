
public class Main {
    public static void main(String[] args) {
        // Задача 1 - Накопление 2 459 000 руб
        System.out.println("Задача 1");

        int targetAmount = 2_459_000;
        int savings = 0;
        int monthlyDeposit = 15_000;
        int month = 0;

        while (savings < targetAmount) {
            month++;
            savings += monthlyDeposit;
            System.out.printf("Месяц %3d, сумма накоплений равна %7d рублей%n", month, savings);
        }


        // Задача 2 - Вывод чисел от 1 до 10 и от 10 до 1
        System.out.println("\nЗадача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 3 - Расчет численности населения через 10 лет
        System.out.println("\nЗадача 3");
        int population = 12_000_000;
        int birthRate = 17;     // Рождаемость на 1000 человек
        int deathRate = 8;      // Смертность на 1000 человек

        for (int year = 1; year <= 10; year++) {
            population += (population / 1000) * (birthRate - deathRate);
            System.out.printf("Год %2d, численность населения составляет %d\n", year, population);
        }


        // Задача 4 - Накопление 12 миллионов рублей с ежемесячным процентом
        System.out.println("\nЗадача 4");
        double savingsVasily    = 15_000;       // Первоначальная сумма
        double targetVasily     = 12_000_000;   // Конечная сумма (Цель)
        double monthlyInterest  = 0.07;         // Ежемесечный процент
        month = 0;

        while (savingsVasily < targetVasily) {
            month++;
            savingsVasily *= (1 + monthlyInterest);
            System.out.printf("Месяц %3d, сумма накоплений равна %11.2f рублей\n", month, savingsVasily);
        }


        // Задача 5 - Вывод накоплений каждые 6 месяцев
        System.out.println("\nЗадача 5");
        savingsVasily = 15_000;
        month = 0;

        while (savingsVasily < targetVasily) {
            month++;
            savingsVasily *= (1 + monthlyInterest);
            if (month % 6 == 0) {
                System.out.printf("Месяц %3d, сумма накоплений равна %11.2f рублей\n", month, savingsVasily);
            }
        }


        // Задача 6 - Накопления каждые полгода в течение 9 лет
        System.out.println("\nЗадача 6");
        savingsVasily = 15_000;
        int years = 9;
        int totalMonths = years * 12;

        for (month = 1; month <= totalMonths; month++) {
            savingsVasily *= (1 + monthlyInterest);
            if (month % 6 == 0) {
                System.out.printf("Месяц %3d, сумма накоплений равна %12.2f рублей\n", month, savingsVasily);
            }
        }
        System.out.println();

    }
}