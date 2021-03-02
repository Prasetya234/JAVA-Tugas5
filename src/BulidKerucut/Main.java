package BulidKerucut;

public class Main {

    public static void main(String[] args) {
        // membuat objek bangun datar
        BangunRuang bangunRuang = new BangunRuang();

        // Membuat nilai Volume dan luas
        Volume hasil = new Volume();
        hasil.r = 10;
        hasil.t = 24;
        // Untuk Membuat Nilai luas kerucut
        hasil.s = 26;

        // Methods
        bangunRuang.luas();
        bangunRuang.volume();

        hasil.luas();
        hasil.volume();
    }
}
