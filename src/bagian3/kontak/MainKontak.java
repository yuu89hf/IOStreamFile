/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.kontak;

/**
 *
 * @author weixi
 */
public class MainKontak {

    public static void main(String[] args) {
        BukuKontak buku = new BukuKontak("kontak.txt");
        buku.tambahKontak(new Kontak("Loreley", "+4978262", "Loreley89@gmail.com"));
        buku.tambahKontak(new Kontak("Helen", "+198672", "helen_w@gmail.com"));
        buku.tambahKontak(new Kontak("Springfield", "+123680", "sfsfsf_1927@gmail.com"));
        buku.tampilkanSemua();
        buku.simpanKeBerkas();
        System.out.println();
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        System.out.println();
        bukuLain.cariKontak("Loreley");
        System.out.println();
        bukuLain.hapusKontak("Loreley");
        System.out.println();
        bukuLain.tampilkanSemua();
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak());
    }
}
