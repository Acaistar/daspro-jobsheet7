import java.util.Scanner;

public class SiakadFor28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, teringgi=0, terendah=100;
        int jumlahLulus=0,jumlahTidakLulus=0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai=sc.nextDouble();
            if (nilai> teringgi) {
                teringgi = nilai;
            }
            if (nilai<terendah) {
                terendah=nilai;
            } 
            if (nilai>=60) {
                jumlahLulus++;
            }else{
                jumlahTidakLulus++;
            }
        }
        System.out.println("Nilai tertinggi: "+teringgi);
        System.out.println("Nilai tertinggi: "+terendah);

        System.out.println("Jumlah mahasiswa lulus: " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + jumlahTidakLulus);
    }
}
