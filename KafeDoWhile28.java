import java.util.Scanner;

public class KafeDoWhile28 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int kopi, teh, roti;
    String namaPelanggan;
    double totalHarga, hargaKopi=12000, hargaTeh=7000, hargaRoti=20000;
    
        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.next();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan. Terima kasih telah berkunjung!");
                break;
            }
            System.out.print("Masukkan jumlah pesanan kopi: ");
            kopi = sc.nextInt();
            System.out.print("Masukkan jumlah pesanan teh: ");
            teh = sc.nextInt();
            System.out.print("Masukkan jumlah pesanan roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            System.out.println("Total harga: " + totalHarga);
            sc.nextLine(); // Membersihkan buffer input
        }while(true);
        System.out.println("Semua transaksi telah selesai. Terima kasih telah berkunjung!");
    }
}
