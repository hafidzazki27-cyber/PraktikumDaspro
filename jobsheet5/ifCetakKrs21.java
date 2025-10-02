import java.util.Scanner;

public class ifCetakKrs21 {

    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Struktur IF-ELSE (Hasil Modifikasi Percobaan 1)
        System.out.println("\n[Hasil IF-ELSE]");
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }
        
        // Transformasi ke Ternary Operator (Tugas 1)
        // Catatan: Karena keluaran terdiri dari dua baris untuk kondisi 'true', 
        // digunakan karakter '\n' (newline) untuk memisahkan baris dalam satu String.
        String hasilKRS = uktLunas ? 
            "Pembayaran UKT terverifikasi\nSilakan cetak KRS dan minta tanda tangan DPA" : 
            "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        
        System.out.println("\n[Hasil Ternary Operator]");
        System.out.println(hasilKRS);
        
        sc.close();
    }
}