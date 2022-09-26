public class Main {
    public static void main(String[] args) {
        // Домашнее задание 2
        // задача 1

        int total = 0;
        int vklad = 15000;
        int monthVklad = 0;

        while (total<2459000) {
            total = vklad + total;
            monthVklad = monthVklad + 1;
            System.out.println("Месяц " + monthVklad +", сумма накоплений равна " +
                    total+ " рублей");

        }

    }
}