package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;


public class Aplikasi {
	public static void main(String[] args) {
		Pembayaran pembayaran = new Pembayaran();
		int nilaiYangDibayar;

		//test case 1
		nilaiYangDibayar = pembayaran.hitungPembayaran(6000000, 0.05);
		System.out.println(nilaiYangDibayar);

		//test case 1
		nilaiYangDibayar = pembayaran.hitungPembayaran(4000000, 0.05);
		System.out.println(nilaiYangDibayar);

		//test case 1
		nilaiYangDibayar = pembayaran.hitungPembayaran(5000000, 0.05);
		System.out.println(nilaiYangDibayar);
		
		System.out.println("----------------------------------------");
		//Latian 2
		Karyawan gaji = new Karyawan();
		int gajiSetelahPPH;

		gajiSetelahPPH = gaji.hitungGaji(6000000, 6000000);
		System.out.println(gajiSetelahPPH);

		gajiSetelahPPH = gaji.hitungGaji(4000000, 3000000);
		System.out.println(gajiSetelahPPH);

		gajiSetelahPPH = gaji.hitungGaji(500000, 1000000);
		System.out.println(gajiSetelahPPH);

	}
}
