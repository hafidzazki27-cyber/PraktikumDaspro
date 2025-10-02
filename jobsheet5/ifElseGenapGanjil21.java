import java.util.Scanner;

public class ifElseGenapGanjil21 { 

    public static void main(String[] args) {
        // 1. Deklarasi (int angka) dan Scanner
        Scanner sc = new Scanner(System.in);
        int angka; 
        
        // 2. Input angka
        System.out.println("--- Pengecekan Bilangan Genap/Ganjil ---");
        System.out.print("Input angka: "); 
        angka = sc.nextInt();
        
        // 3. Struktur IF-ELSE (angka % 2 == 0)
        // Jika kondisi (angka % 2 == 0) menghasilkan TRUE (Ya)
        if (angka % 2 == 0) { 
            // Output "Genap"
            System.out.println("Genap"); 
        } 
        // Jika kondisi menghasilkan FALSE (Tidak)
        else { 
            // Output "Ganjil"
            System.out.println("Ganjil");
        }
        
        sc.close();
    }
}