public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        // задача 3


        int vklad = 15000;
        int percentYear = 7;
        int monthVklad = 0;
        int monthAll = 108;
        int total = 0;

        for (;monthVklad <= monthAll;monthVklad = monthVklad + 1) {

            total = vklad + total + total / 100 * percentYear / 12;
            if (monthVklad % 6 == 0) {
                System.out.println("Месяц  " + monthVklad +
                        ", сумма накоплений составляет " + total + " рублей");
            }

        }
        System.out.println("За 9 лет, сумма накоплений составит " + total + " рублей");

    }
}