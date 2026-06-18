/*
Nama : Muhammad Haffi Yudhani
NPM : 2410010005
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author weixi
 */
public class MainTugas {

    public static void main(String[] args) {
        String[] kategori = {"AR", "Rifle", "Shotgun"};
        System.out.println("=== Daftar Kategori ===");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("DSR-50", 50000, 50));
        gudang.tambahBarang(new Barang("IWS 2000", 20000, 30));
        gudang.tambahBarang(new Barang("G11", 11000, 40));
        gudang.tambahBarang(new Barang("DP-12", 12000, 25));
        gudang.tambahBarang(new Barang("TAR-21", 21000, 15));
        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        System.out.println();
        System.out.println("Total nilai persediaan = $" + gudangBaru.totalNilai());
    }
}
