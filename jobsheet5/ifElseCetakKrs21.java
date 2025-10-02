import java.util.Scanner;

public class ifElseCetakKrs21 {

    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in); // [cite: 60]

        System.out.println("--- Cetak KRS SIAKAD ---"); // [cite: 63]
        System.out.print("Masukkan semester saat ini: "); // [cite: 64]
        int semester = sc.nextInt(); // [cite: 64]

        // Transformasi struktur SWITCH-CASE ke IF-ELSE IF-ELSE
        if (semester == 1) {
            System.out.println("KRS Semester 1 ditampilkan"); // [cite: 74]
        } else if (semester == 2) {
            System.out.println("KRS Semester 2 ditampilkan"); // [cite: 76]
        } else if (semester == 3) {
            System.out.println("KRS Semester 3 ditampilkan"); // [cite: 79]
        } else if (semester == 4) {
            System.out.println("KRS Semester 4 ditampilkan"); // [cite: 82]
        } else if (semester == 5) {
            System.out.println("KRS Semester 5 ditampilkan"); // [cite: 85]
        } else if (semester == 6) {
            System.out.println("KRS Semester 6 ditampilkan"); // [cite: 88]
        } else if (semester == 7) {
            System.out.println("KRS Semester 7 ditampilkan"); // [cite: 91]
        } else if (semester == 8) {
            System.out.println("KRS Semester 8 ditampilkan"); // [cite: 94]
        } else {
            System.out.println("Semester tidak valid"); // 
        }
        
        sc.close();
    }
}
