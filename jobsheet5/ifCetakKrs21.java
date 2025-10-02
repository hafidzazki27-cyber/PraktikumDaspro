import java.util.Scanner;

public class ifCetakKrs21 {

    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in); // [cite: 29, 30]

        System.out.println("--- Cetak KRS SIAKAD ---"); // [cite: 37]
        System.out.print("Apakah UKT sudah lunas? (true/false): "); // 
        boolean uktLunas = sc.nextBoolean(); // 

        // Struktur pemilihan IF-ELSE
        if (uktLunas) { // [cite: 39]
            System.out.println("Pembayaran UKT terverifikasi"); // [cite: 41]
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA"); // [cite: 42]
        } else {
            // Tambahan struktur ELSE sesuai permintaan
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu"); // [cite: 52]
        }
        
        sc.close();
    }
}