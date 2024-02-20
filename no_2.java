package java_beginning;

import java.util.Scanner;

public class no_2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah tabungan Anda : ");
        double tabungan = userInput.nextDouble();
        
        System.out.print("Apakah Anda sudah memiliki calon pasangan? (true/false): ");
        boolean calonPasangan = userInput.nextBoolean();
        
        if (tabungan > 100000000 && calonPasangan) {
            System.out.println("Anda akan menikah.");
        } else {
            System.out.println("Anda belum siap untuk menikah.");
        }
        
        userInput.close();
    }
}

