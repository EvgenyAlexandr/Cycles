
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
        System.out.println();


    }
}