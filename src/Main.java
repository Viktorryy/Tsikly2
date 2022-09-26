public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        // задача 2


        int vklad = 15000;
        int percentYear = 7;
        int monthVklad = 0;
        int total = 0;

        while (total <= 12_000_000) {
            monthVklad = monthVklad + 1;
            total = vklad + total + total / 100 * percentYear / 12;
            if (monthVklad % 6 == 0) {
                System.out.println("Месяц  " + monthVklad +
                        ", сумма накоплений составляет " + total + " рублей");
            }

        }


    }
}