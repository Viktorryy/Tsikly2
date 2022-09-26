public class Main {
    public static void main(String[] args) {
        // Домашнее задание 3
        // задача 1

        int yearNow = 2022;
        int period = 79;
        int year0 = 0;
        int year200 = yearNow - 200;
        int year100 = yearNow + 100;

        while (year0 <= year100 ) {
            year0 = year0 + period;
            if (year0 >= year200 && year0 <= year100) {
                System.out.println(year0);

            }

        }


    }
}