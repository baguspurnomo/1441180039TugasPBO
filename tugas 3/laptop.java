class  leptop {

	private String merk;
	private String warna;
	private String wifi;
	private int baterai;

	public leptop()
	{
		merk	="thosiba";
		warna	="putih";
		wifi	="terhubung";
		baterai	=50;
	}
	public leptop(String merkinput, String warnainput)
	{	merk	=merkinput;
		warna	=warnainput;
		
	}
	public leptop(String merkinput, String warnainput, String wifiinput)
	{	merk	=merkinput;
		warna	=warnainput;
		wifi	=wifiinput;
		
	}
	public leptop(String merkinput, String warnainput, String wifiinput, int bateraiinnput)
	{	merk	=merkinput;
		warna	=warnainput;
		wifi	=wifiinput;
		baterai	=bateraiinnput;

	}

	 public void menyala()
	 {
	 	System.out.println("welcome to leptop");
	 }


	 public void mati()
	 {
	 	System.out.println("thankyou have a nice day ");

	 }

	 public void indikatorbaterai(){
	 	System.out.println("baterai : " + baterai + "%");
	 }

	 public void indikatorwifi(){
	 	System.out.println("wifi : " + wifi + "%");
	 }

	 //setter and getter
	 public String getmerk(){
	 	return merk;
	 }

	 public String getwarna(){
	 	return warna;

	 }
	public int getbaterai(){
	 	return baterai;
	 }

	 public String getwifi(){
	 	return wifi;
	 }
}