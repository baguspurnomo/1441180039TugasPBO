class testMobil {
	public static void main(String[] args) {
		mobil bagus = new mobil();

		System.out.println("merk		=" +bagus.getmerk());
		System.out.println("platNomor	=" +bagus.getplatNomor());
		System.out.println("warna 		=" +bagus.getwarna());
		System.out.println("mesin		=" +bagus.getmesin() +"cc");
		System.out.println("kecepatan	=" +bagus.getkecepatan() +"km");
		bagus.maju();
		System.out.println(" ");	

	 mobil brewok = new mobil("Chevrolet","M4558AR");

		System.out.println("merk		=" +brewok.getmerk());
		System.out.println("platNomor	=" +brewok.getplatNomor());
		brewok.mundur();
		System.out.println(" ");


	mobil bagong = new mobil("LykanSport","M4554RD","Merah");

		System.out.println("merk		=" +bagong.getmerk());
		System.out.println("platNomor 	=" +bagong.getplatNomor());
		System.out.println("warna  		=" +bagong.getwarna());
		bagong.berhenti();
		System.out.println(" ");


	mobil bagas = new mobil("MiniChoper","H45AN","Hitam",1200);

		System.out.println("merk		=" +bagas.getmerk());
		System.out.println("platNomor 	=" +bagas.getplatNomor());
		System.out.println("warna  		=" +bagas.getwarna());
		System.out.println("mesin   	=" +bagas.getmesin() +"cc");
		bagas.belok();
		System.out.println(" ");

	mobil bengal = new mobil("Gallardo","D4N","Biru",2000,135);

		System.out.println("merk		=" +bengal.getmerk());
		System.out.println("platNomor 	=" +bengal.getplatNomor());
		System.out.println("warna  		=" +bengal.getwarna());
		System.out.println("mesin   	=" +bengal.getmesin() +"cc");
		System.out.println("kecepatan	=" +bengal.getkecepatan() +"km"); 
		bengal.ngebut();
		System.out.println(" ");
	

	
}
}