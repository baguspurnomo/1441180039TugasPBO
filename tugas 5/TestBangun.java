public class TestBangun {
	public static void main(String[] args) {
		Segitiga sgt = new Segitiga();
		Lingkaran lkn = new Lingkaran();
		System.out.println("::: SEGITIGA :::");
		sgt.tinggi = 11;
		sgt.alas = 4;
		sgt.sisi1 = 6;
		sgt.sisi2 = 5;
		sgt.sisi3 = 4;

		sgt.nilaiProperty();

		System.out.println("Luas : " +sgt.hitungLuas());
		System.out.println("Keliling : "+sgt.hitungKeliling());		

		System.out.println("\n");

		System.out.println("::: LINGKARAN :::");
		lkn.jejari = 7;
		lkn.nilaiProperty();

		System.out.println("Luas : " +lkn.hitungLuasLingkaran());
		System.out.println("Keliling : "+lkn.hitungKelilingLingkaran());
	}
}