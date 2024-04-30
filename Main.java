import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data Pegawai Tetap
        System.out.println("Input Data Pegawai Tetap:");
        Pegawai[] pegawaiTetapList = new PegawaiTetap[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Pegawai ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("No KTP: ");
            String noKTP = scanner.nextLine();
            System.out.print("Upah: ");
            double upah = scanner.nextDouble();
            scanner.nextLine(); // Clear the buffer
            pegawaiTetapList[i] = new PegawaiTetap(nama, noKTP, upah);
        }

        // Input data Pegawai Harian
        System.out.println("\nInput Data Pegawai Harian:");
        Pegawai[] pegawaiHarianList = new PegawaiHarian[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Pegawai ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("No KTP: ");
            String noKTP = scanner.nextLine();
            System.out.print("Upah per Jam: ");
            double upahPerJam = scanner.nextDouble();
            System.out.print("Total Jam Kerja: ");
            int totalJam = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            pegawaiHarianList[i] = new PegawaiHarian(nama, noKTP, upahPerJam, totalJam);
        }

        // Input data Sales
        System.out.println("\nInput Data Sales:");
        Pegawai[] salesList = new Sales[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Sales ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("No KTP: ");
            String noKTP = scanner.nextLine();
            System.out.print("Komisi: ");
            double komisi = scanner.nextDouble();
            System.out.print("Total Penjualan: ");
            int penjualan = scanner.nextInt();
            scanner.nextLine(); // Clear the buffer
            salesList[i] = new Sales(nama, noKTP, komisi, penjualan);
        }

        scanner.close();

        // Menampilkan informasi dan gaji pegawai secara berurutan
        System.out.println("\nInformasi dan Gaji Pegawai:");
        for (Pegawai pegawai : pegawaiTetapList) {
            System.out.println(pegawai);
            System.out.println("Gaji Pegawai Tetap: Rp " + pegawai.gaji());
            System.out.println("-----------------------------");
        }
        for (Pegawai pegawai : pegawaiHarianList) {
            System.out.println(pegawai);
            System.out.println("Gaji Pegawai Harian: Rp " + pegawai.gaji());
            System.out.println("-----------------------------");
        }
        for (Pegawai pegawai : salesList) {
            System.out.println(pegawai);
            System.out.println("Gaji Sales: Rp " + pegawai.gaji());
            System.out.println("-----------------------------");
        }
    }
}
