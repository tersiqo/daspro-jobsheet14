import java.util.Scanner;

public class HitungTotalNilai {
    static int hitungTotalRekursif(int[] angka, int n) {
        if (n == 0) return 0; 
        return angka[n - 1] + hitungTotalRekursif(angka, n - 1); 
    }

    static int hitungTotalIteratif(int[] angka, int n) {
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += angka[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
        int n = sc.nextInt();
        
        int[] angka = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = sc.nextInt();
        }

        int totalRekursif = hitungTotalRekursif(angka, n);
        int totalIteratif = hitungTotalIteratif(angka, n);

        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalRekursif + " (Rekursif)");
        System.out.println("Total dari " + n + " angka yang dimasukkan adalah: " + totalIteratif + " (Iteratif)");
    }
}
