package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;
import billing.Costumer;

public class Aplikasi {
  public static void main(String[] args) {
    Pembayaran pembayaran = new Pembayaran();
    int nilaiYangDibayar;

    // test case 1
    nilaiYangDibayar = pembayaran.hitungPembayaran(6000000, 0.05);
    System.out.println(nilaiYangDibayar);

    // test case 1
    nilaiYangDibayar = pembayaran.hitungPembayaran(4000000, 0.05);
    System.out.println(nilaiYangDibayar);

    // test case 1
    nilaiYangDibayar = pembayaran.hitungPembayaran(5000000, 0.05);
    System.out.println(nilaiYangDibayar);

    System.out.println("----------------------------------------");
    // Latian 2
    Karyawan gaji = new Karyawan();
    int gajiSetelahPPH;

    gajiSetelahPPH = gaji.hitungGaji(6000000, 0.1, 6000000);
    System.out.println(gajiSetelahPPH);

    gajiSetelahPPH = gaji.hitungGaji(4000000, 0.1, 3000000);
    System.out.println(gajiSetelahPPH);

    gajiSetelahPPH = gaji.hitungGaji(500000, 0.1, 1000000);
    System.out.println(gajiSetelahPPH);

    System.out.println("----------------------------------------");
    // Latian 3
    int PPH;

    PPH = gaji.hitungPPH(6000000, 0.1, 6000000);
    System.out.println(PPH);

    PPH = gaji.hitungPPH(4000000, 0.1, 3000000);
    System.out.println(PPH);

    PPH = gaji.hitungPPH(500000, 0.1, 1000000);
    System.out.println(PPH);

    System.out.println("----------------------------------------");
    // Latihan 4
    Costumer costumer = new Costumer();
    int pembayaranCostumer;

    pembayaranCostumer = costumer.hitungPembayaranTagihan(400000, 0.01, 1, 4);
    System.out.println(pembayaranCostumer);
    pembayaranCostumer = costumer.hitungPembayaranTagihan(300000, 0.01, 1, 3);
    System.out.println(pembayaranCostumer);
  }
}
