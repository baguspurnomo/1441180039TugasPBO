class testTabungan {
	public static void main(String[] args) {
		tabungan rezha = new tabungan();

		System.out.println("simpanan 	=" +rezha.setsimpanan());
		System.out.println("pemilikRek 	=" +rezha.setpemilikRek());
		System.out.println("noRek 		=" +rezha.getnoRekening());
		System.out.println("bunga 		=" +rezha.getbunga());
		rezha.menabung();
		System.out.println(" ");




tabungan bagus = new tabungan("BENGAL","Mandiri");

		System.out.println("simpanan 	=" +bagus.setsimpanan());
		System.out.println("pemilikRek 	=" +bagus.setpemilikRek());
		bagus.mengambil();
		System.out.println(" ");



tabungan bagong = new tabungan("BAGONG","BCA",1441180039);
		
		System.out.println("simpanan 	=" +bagong.setsimpanan());
		System.out.println("pemilikRek 	=" +bagong.setpemilikRek());
		System.out.println("noRek 		=" +bagong.getnoRekening());
		bagong.transfer();
		System.out.println("");



tabungan brewok = new tabungan("BREWOK","BNI",1441180039,60);

		System.out.println("simpanan 	=" +brewok.setsimpanan());
		System.out.println("pemilikRek 	=" +brewok.setpemilikRek());
		System.out.println("noRek 		=" +brewok.getnoRekening());
		System.out.println("bunga 		=" +brewok.getbunga());
		brewok.menerimaTransfer();
		System.out.println(" ");
	





	}

}