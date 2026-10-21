import java.util.Scanner;

public class Parkir28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi,total=0;
        
        System.out.println("=== PROGRAM KASIR PARKIR ===");

        do {
            System.out.println("\nJenis Kendaraan:");
            System.out.println("1. Mobil");
            System.out.println("2. Motor");
            System.out.println("0. Keluar");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = sc.nextInt();

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();

                if (jenis == 1) {
                    total = durasi * 3000;
                } else if (jenis == 2) {
                    total = durasi * 2000;
                }
            } else if (jenis == 0) {
                System.out.println("Terima kasih telah menggunakan layanan parkir kami!");
                break;
            } else {
                System.out.println("Jenis kendaraan tidak valid. Silakan masukkan ulang.");
                continue; // Kembali ke awal loop jika input tidak valid
            }
        } while (true);
        System.out.println("Total pendapatan hari ini: Rp " + total);
        sc.close();
    }
}
