package alarmsystem;

public class Alarm {
  public boolean isAlarmStatusWarning(
      double suhuAwal, boolean isSensorAsap, boolean isSensorWater) {

    if (suhuAwal > 55.5 || isSensorAsap == true || isSensorWater == true) {
      return true;
    } else {
      return false;
    }
  }
}
