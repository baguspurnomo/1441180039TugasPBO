public class Segitiga {
	int tinggi;
	int alas;
	int sisi1;
	int sisi2;
	int sisi3;

	public void nilaiProperty() {
		System.out.println("Tinggi : " +tinggi);
		System.out.println("Alas   : " +alas);
		System.out.println("Sisi1  : " +sisi1);
		System.out.println("Sisi2  : " +sisi2);
		System.out.println("Sisi3  : " +sisi3);
	}
	public void ubahProperty(int tinggiBaru, int alasBaru, int sisi1Baru, int sisi2Baru, int sisi3Baru){
		tinggi = tinggiBaru;
		alas = alasBaru;
		sisi1 = sisi1Baru;
		sisi2 = sisi2Baru;
		sisi3 = sisi3Baru;
	}
	public int hitungLuas(){
		int luas;
		luas = (alas * tinggi) / 2;
		return luas;
	}
	public int hitungKeliling(){
		int keliling;
		keliling =  sisi1 + sisi2 + sisi3;
		return keliling;
	}
}