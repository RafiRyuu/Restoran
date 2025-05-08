public class UTSRestoran {

    // Class Menu: Menampilkan daftar makanan (Class & Object)
    static class Menu {
        String nama;
        double harga;

        public Menu(String nama, double harga) {
            this.nama = nama;
            this.harga = harga;
        }

        public void tampilkanMenu() {
            System.out.println(nama + " - Rp" + harga);
        }
    }

    // Class Pelanggan: Menggunakan Enkapsulasi
    static class Pelanggan {
        private String nama;
        private String noMeja;

        public Pelanggan(String nama, String noMeja) {
            this.nama = nama;
            this.noMeja = noMeja;
        }

        public String getNama() {
            return nama;
        }

        public String getNoMeja() {
            return noMeja;
        }
    }

    // Inheritance Level 1: Kelas induk
    static class Pesanan {
        String kodePesanan;

        public void prosesPesanan() {
            System.out.println("Pesanan dengan kode " + kodePesanan + " sedang diproses.");
        }
    }

    // Inheritance Level 2: Turunan pertama
    static class PesananDineIn extends Pesanan {
        String noMeja;

        public void makanDiTempat() {
            System.out.println("Pesanan untuk makan di tempat, meja: " + noMeja);
        }
    }

    // Inheritance Level 3: Turunan kedua (sub-child class)
    static class PesananVIP extends PesananDineIn {
        public void layananSpesial() {
            System.out.println("Layanan VIP: Pesanan diprioritaskan dengan pelayanan khusus.");
        }
    }

    // Main Method
    public static void main(String[] args) {
        // Menampilkan daftar menu menggunakan array
        Menu[] daftarMenu = new Menu[3];
        daftarMenu[0] = new Menu("Nasi Goreng", 25000);
        daftarMenu[1] = new Menu("Ayam Bakar", 30000);
        daftarMenu[2] = new Menu("Mie Goreng", 22000);

        System.out.println("Daftar Menu Restoran");
        for (Menu m : daftarMenu) {
            m.tampilkanMenu();
        }

        // Membuat objek pelanggan
        System.out.println("\nInfo Pelanggan");
        Pelanggan pelanggan = new Pelanggan("Rina", "A7");
        System.out.println("Nama: " + pelanggan.getNama());
        System.out.println("Meja: " + pelanggan.getNoMeja());

        // Membuat objek pesanan VIP (menggunakan inheritance 3 tingkat)
        System.out.println("\nProses Pesanan VIP");
        PesananVIP pesanan = new PesananVIP();
        pesanan.kodePesanan = "P001";
        pesanan.noMeja = pelanggan.getNoMeja();
        pesanan.prosesPesanan();
        pesanan.makanDiTempat();
        pesanan.layananSpesial();
    }
}
