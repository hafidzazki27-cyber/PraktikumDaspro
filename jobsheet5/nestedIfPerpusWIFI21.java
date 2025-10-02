import java.util.Scanner;

public class nestedIfPerpusWIFI21 { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pesan;

        System.out.println("--- Cek Akses WIFI Kampus (Sistem Perpustakaan) ---");
        
        // Cek Level 1: Status Keanggotaan Perpustakaan
        System.out.print("Apakah Anda terdaftar sebagai anggota Perpustakaan? (Ya/Tidak): ");
        String anggotaPerpus = sc.nextLine().trim();

        if (anggotaPerpus.equalsIgnoreCase("Ya")) {
            
            // Cek Level 2: Status Tunggakan/Denda
            System.out.print("Apakah Anda memiliki tunggakan/denda pinjaman? (Ya/Tidak): ");
            String masalahPinjaman = sc.nextLine().trim();
            
            if (masalahPinjaman.equalsIgnoreCase("Tidak")) {
                // Kondisi LULUS: Anggota Ya, Masalah Pinjaman Tidak
                pesan = "Akses WIFI Diberikan. Selamat menikmati layanan kampus!";
            } else {
                // Kondisi GAGAL Level 2: Anggota Ya, Masalah Pinjaman Ya
                pesan = " Akses WIFI Ditolak. Harap selesaikan tanggungan/denda pinjaman di Perpustakaan terlebih dahulu.";
            }
        } else {
            // Kondisi GAGAL Level 1: Anggota Tidak
            pesan = " Akses WIFI Ditolak. Anda harus terdaftar sebagai anggota Perpustakaan kampus untuk mendapatkan akses.";
        }

        System.out.println("\nHasil Cek Akses: " + pesan);
        
        sc.close();
    }
}
