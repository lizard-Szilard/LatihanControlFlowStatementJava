package sdm;

public class Karyawan {
	public int hitungGaji(int gajiSebelumPPH, int PTKP){
	
	int Gaji = gajiSebelumPPH;

	if (Gaji >= PTKP){
		Gaji = (int) (Gaji - Gaji * 0.1);
	}

	return Gaji;

}
}
