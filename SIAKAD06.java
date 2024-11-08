import java.util.Scanner;

public class SIAKAD06 {
    public static void main(String[] args) {
        int[][] nilai = new int[4][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1));
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j+1) + ": ");
                nilai[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-" + (i+1) + ": ");
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah ke-" + (j+1) + ": ");
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("Nilai rata-rata: " + totalPerSiswa/3);
        }

        System.out.println("\n================================================");
        System.out.println("Rata-rata nilai setiap mata kuliah");
        for (int j = 0; j < 3; j++) {
            double totalPerMataKuliah = 0;
            for (int i = 0; i < 4; i++) {
                totalPerMataKuliah += nilai[i][j];
            }
            System.out.println("Mata Kuliah " + (j+1) + ": " + totalPerMataKuliah/4);
        }
    }
}

