import java.util.Scanner;

public class Tugas06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] responSurvei = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1) + ":");
            for (int j = 0; j < 6; j++) {
                System.out.print("Input nilai untuk pertanyaan ke-" + (j + 1) + " (1-5): ");
                responSurvei[i][j] = input.nextInt();
            }
            System.out.println();
        }

        System.out.println("Rata rata setiap responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += responSurvei[i][j];
            }
            double rataResponden = (double) total / 6;
            System.out.println("Responden " + (i + 1) + " : " + rataResponden);
        }
        System.out.println();
        System.out.println("Rata rata setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += responSurvei[i][j];
            }
            double rataPertanyaan = (double) total / 10;
            System.out.println("Pertanyaan " + (j + 1) + " : " + rataPertanyaan);
        }
        System.out.println();
        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += responSurvei[i][j];
            }
        }
        double rataRataKeseluruhan = (double) totalKeseluruhan / (10 * 6);
        System.out.println("Rata rata keseluruhan : " + rataRataKeseluruhan);
    }
}