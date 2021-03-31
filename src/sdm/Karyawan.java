package sdm;

public class Karyawan {
  public int hitungGaji(int gajiSebelumPPH, double PPH, int PTKP) {

    int Gaji = gajiSebelumPPH;

    if (Gaji >= PTKP) {
      Gaji = (int) (Gaji - Gaji * PPH);
    }

    return Gaji;
  }

  public int hitungPPH(int gajiSebelumPPH, double PPH, int PTKP) {

    int nominalPajak = 0;

    if (gajiSebelumPPH >= PTKP) {
      nominalPajak = (int) (gajiSebelumPPH * PPH);
    }
    return nominalPajak;
  }
}
