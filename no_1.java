package java_beginning;

import java.util.Scanner;

public class no_1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan Bilangan Pertama (contoh: -2,5): ");
        double variable1 = userInput.nextDouble();
        System.out.print("Masukkan Bilangan Kedua (contoh: -2,5): ");
        double variable2 = userInput.nextDouble();
        System.out.print("Masukkan Bilangan Ketiga contoh: -2,5): ");
        double variable3 = userInput.nextDouble();
        
        double penjumlahan = variable1 + variable2 + variable3;
        double pengurangan = variable1 - variable2 - variable3;
        double perkalian = variable1 * variable2 * variable3;
        double pembagian = variable1 / variable2 / variable3;

        System.out.printf("\nHasil Penjumlahan = %.2f\n", penjumlahan);
        System.out.printf("Hasil Pengurangan = %.2f\n", pengurangan);
        System.out.printf("Hasil Perkalian = %.2f\n", perkalian);
        System.out.printf("Hasil Pembagian = %.2f\n\n", pembagian);

        userInput.close();
    }
}


