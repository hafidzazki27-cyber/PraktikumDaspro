import java.util.Scanner;

public class nestedUjianSkripsi21 {

    public static void main(String[] args) {
        // 3. Import library Scanner dan deklarasikan scanner
        Scanner sc = new Scanner(System.in);
        
        // 4. Deklarasikan variabel pesan bertipe String
        String pesan;

        // 5. Menerima masukan informasi kompen
        System.out.print("Apakah mahasiswa sudah bebas kompen? (Ya/Tidak): ");
        String bebasKompen = sc.nextLine().trim(); // Catatan: fungsi trim()
        
        // 6. Menerima masukan informasi log bimbingan
        // Catatan: sc.nextInt() tidak membersihkan newline, 
        // namun untuk kasus ini, kita menggunakan sc.nextLine() di atas 
        // sehingga tidak ada masalah dengan newline yang tersisa.
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        
        System.out.print("Masukkan jumlah log bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();
        
        // 7. Buat struktur pemilihan Nested-IF
        // Pengecekan Level 1: Bebas Kompen
        if (bebasKompen.equalsIgnoreCase("Ya")) {
            // Pengecekan Level 2: Jumlah Log Bimbingan
            
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                // Kondisi: Semua syarat bimbingan terpenuhi
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                // Kondisi: Kedua bimbingan kurang
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                // Kondisi: Hanya P1 yang kurang dari 8 (P2 sudah >= 4)
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali";
            } else {
                // Kondisi: Hanya P2 yang kurang dari 4 (P1 sudah >= 8)
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            // Level 1: Syarat Kompen Gagal
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
        }

        // Menampilkan hasil
        System.out.println(pesan);
        
        sc.close();
    }
}