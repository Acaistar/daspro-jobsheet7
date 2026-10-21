import java.util.Scanner;

public class BioskopTiket28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalTiketHariIni = 0;
        double totalPenjualanHariIni = 0, hargaTiket = 50000;
        boolean pilihanLanjut;

        System.out.println("=== PROGRAM KASIR PENJUALAN TIKET BIOSKOP ===");

        do {
            System.out.print("\nMasukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            // Validasi: Jika input negatif, abaikan dan minta input ulang menggunakan continue
            if (jumlahTiket < 0) {
                System.out.println("Peringatan: Jumlah tiket tidak boleh negatif! Silakan masukkan ulang.");
                continue; 
            }

            // Menghitung harga awal sebelum diskon
            double hargaTotal = jumlahTiket * hargaTiket;
            double diskon = 0;

            // Menentukan diskon berdasarkan ketentuan
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15% untuk pembelian > 10 tiket
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10% untuk pembelian > 4 tiket (5 s.d. 10 tiket)
            }

            // Menghitung total harga setelah diskon
            double totalBayar = hargaTotal - (hargaTotal * diskon);

            // Akumulasi total tiket dan total pendapatan harian
            totalTiketHariIni += jumlahTiket;
            totalPenjualanHariIni += totalBayar;

            // Menampilkan rincian transaksi pelanggan saat ini
            System.out.println("--- Rincian Transaksi ---");
            System.out.println("Jumlah Tiket : " + jumlahTiket);
            System.out.println("Diskon       : " + (int)(diskon * 100) + "%");
            System.out.println("Total Bayar  : Rp " + totalBayar);

            // Menanyakan apakah ingin melanjutkan transaksi berikutnya
            System.out.print("\nApakah ingin input transaksi pelanggan lain? (y/t): ");
            String input = sc.next();
            pilihanLanjut = input.equalsIgnoreCase("y");
            if (!pilihanLanjut) {
                break;
            }
        } while (true);

        // Menampilkan rekapitulasi akhir hari
        System.out.println("\n==========================================");
        System.out.println("       REKAPITULASI PENJUALAN HARI INI    ");
        System.out.println("==========================================");
        System.out.println("Total seluruh tiket terjual : " + totalTiketHariIni + " tiket");
        System.out.println("Total pendapatan penjualan  : Rp " + totalPenjualanHariIni);
        System.out.println("==========================================");

        sc.close();
    }
}