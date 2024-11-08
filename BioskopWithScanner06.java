import java.util.Scanner;

public class BioskopWithScanner06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama penonton: ");
                String nama = scanner.nextLine();

                int baris, kolom;
                while (true) {
                    System.out.print("Masukkan baris (1-4): ");
                    baris = scanner.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = scanner.nextInt();
                    scanner.nextLine();

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Posisi baris atau kolom tidak valid. Silakan masukkan nomor yang sesuai.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        break;
                    }
                }

            } else if (pilihan == 2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, penonton[i][j] != null ? penonton[i][j] : "***");
                    }
                }
            } else if (pilihan == 3) {
                System.out.println("Terima kasih. Program selesai.");
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        }
    }
}