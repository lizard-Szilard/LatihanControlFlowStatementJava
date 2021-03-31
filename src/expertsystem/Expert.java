package expertsystem;

public class Expert {
  public boolean isAceticAcid(boolean bentukTumpahan, int nPH, boolean bauTumpahan) {

    if (bentukTumpahan == true && nPH < 6 && bauTumpahan == true) {
      return true;
    }else{
      return false;
    }
  }
}