public class Main {
    public static void main(String[] args) {
        // Домашнее задание 2
        // задача 3


        int population = 12_000_000;
        int fertility1000 = 17;
        int mortality1000 = 8;


        int term = 10;

         for ( int i = 1; i <= term; i++) {

             population = population + population / 1000 * (fertility1000 - mortality1000);

             System.out.println("Год " + i + ", численность населения составляет " + population);
        }

    }
}