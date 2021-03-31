package main;

import pembayaran.Pembayaran;
import sdm.Karyawan;
import billing.Costumer;
import expertsystem.Expert;
import alarmsystem.Alarm;

public class Aplikasi {
  public static void main(String[] args) {

    // Latihan 1
    Pembayaran pembayaran = new Pembayaran();
    int nilaiYangDibayar;

    // test case 1
    nilaiYangDibayar = pembayaran.hitungPembayaran(6000000, 0.05);
    System.out.println(nilaiYangDibayar);

    // test case 2
    nilaiYangDibayar = pembayaran.hitungPembayaran(4000000, 0.05);
    System.out.println(nilaiYangDibayar);

    // test case 3
    nilaiYangDibayar = pembayaran.hitungPembayaran(5000000, 0.05);
    System.out.println(nilaiYangDibayar);

    System.out.println("----------------------------------------");
    // Latian 2
    Karyawan gaji = new Karyawan();
    int gajiSetelahPPH;

    // test case 1
    gajiSetelahPPH = gaji.hitungGaji(6000000, 0.1, 6000000);
    System.out.println(gajiSetelahPPH);

    // test case 2
    gajiSetelahPPH = gaji.hitungGaji(4000000, 0.1, 3000000);
    System.out.println(gajiSetelahPPH);

    // test case 3
    gajiSetelahPPH = gaji.hitungGaji(500000, 0.1, 1000000);
    System.out.println(gajiSetelahPPH);

    System.out.println("----------------------------------------");
    // Latian 3
    int PPH;

    // test case 1
    PPH = gaji.hitungPPH(6000000, 0.1, 6000000);
    System.out.println(PPH);

    // test case 2
    PPH = gaji.hitungPPH(4000000, 0.1, 3000000);
    System.out.println(PPH);

    // test case 3
    PPH = gaji.hitungPPH(500000, 0.1, 1000000);
    System.out.println(PPH);

    System.out.println("----------------------------------------");
    // Latihan 4
    Costumer costumer = new Costumer();
    int pembayaranCostumer;

    // test case 1
    pembayaranCostumer = costumer.hitungPembayaranTagihan(400000, 0.01, 1, 4);
    System.out.println(pembayaranCostumer);

    // test case 2
    pembayaranCostumer = costumer.hitungPembayaranTagihan(300000, 0.01, 1, 3);
    System.out.println(pembayaranCostumer);

    System.out.println("----------------------------------------");
    // Latian 5
    Expert expert = new Expert();
    boolean jenisTumpahan;
    // test case 1
    jenisTumpahan = expert.isAceticAcid(true, 5, true);
    System.out.println(jenisTumpahan);

    // test case 2
    jenisTumpahan = expert.isAceticAcid(true, 6, true);
    System.out.println(jenisTumpahan);

    // test case 3
    jenisTumpahan = expert.isAceticAcid(true, 7, true);
    System.out.println(jenisTumpahan);

    // test case 4
    jenisTumpahan = expert.isAceticAcid(true, 5, false);
    System.out.println(jenisTumpahan);

    // test case 5
    jenisTumpahan = expert.isAceticAcid(true, 6, false);
    System.out.println(jenisTumpahan);

    // test case 6
    jenisTumpahan = expert.isAceticAcid(true, 7, false);
    System.out.println(jenisTumpahan);

    // test case 7
    jenisTumpahan = expert.isAceticAcid(false, 5, true);
    System.out.println(jenisTumpahan);

    // test case 8
    jenisTumpahan = expert.isAceticAcid(false, 6, true);
    System.out.println(jenisTumpahan);

    // test case 9
    jenisTumpahan = expert.isAceticAcid(false, 7, true);
    System.out.println(jenisTumpahan);

    System.out.println("----------------------------------------");
    // Latihan 6
    Alarm alarm = new Alarm();
    boolean reportStatusAlarm;

    // test case 1
    reportStatusAlarm = alarm.isAlarmStatusWarning(55.5, true, true);
    System.out.println(reportStatusAlarm);

    // test case 2
    reportStatusAlarm = alarm.isAlarmStatusWarning(60, true, true);
    System.out.println(reportStatusAlarm);

    // test case 3
    reportStatusAlarm = alarm.isAlarmStatusWarning(40, true, true);
    System.out.println(reportStatusAlarm);

    // test case 4
    reportStatusAlarm = alarm.isAlarmStatusWarning(55.5, false, true);
    System.out.println(reportStatusAlarm);

    // test case 5
    reportStatusAlarm = alarm.isAlarmStatusWarning(60, false, true);
    System.out.println(reportStatusAlarm);

    // test case 6
    reportStatusAlarm = alarm.isAlarmStatusWarning(40, false, true);
    System.out.println(reportStatusAlarm);

    // test case 7
    reportStatusAlarm = alarm.isAlarmStatusWarning(55.5, false, false);
    System.out.println(reportStatusAlarm);

    // test case 8
    reportStatusAlarm = alarm.isAlarmStatusWarning(60, false, false);
    System.out.println(reportStatusAlarm);

    // test case 9
    reportStatusAlarm = alarm.isAlarmStatusWarning(40, false, false);
    System.out.println(reportStatusAlarm);
  }
}
