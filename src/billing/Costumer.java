package billing;

import java.time.LocalDate;

public class Costumer {

  public int hitungPembayaranTagihan(
      int tagihanSebelumDenda, double prosentaseDenda, int tglJatuhTempo, int blnJatuhTempo) {
    LocalDate localDate = LocalDate.now();
    int tanggalSekarang = localDate.getDayOfMonth();
    int bulanSekarang = localDate.getMonthValue();
    int pembayaranDenda = tagihanSebelumDenda;

    if (tglJatuhTempo > tanggalSekarang && blnJatuhTempo > bulanSekarang) {
      pembayaranDenda = (int) (tagihanSebelumDenda + tagihanSebelumDenda * prosentaseDenda);
    }
    return pembayaranDenda;
  }
}
