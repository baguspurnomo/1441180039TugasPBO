public class Mahasiswa {
	//set atribut
	String nama;
	int umur;

	public Mahasiswa() {
		nama = "Ridwan Rismanto";
		umur = 20;
	}
	public void tampilkanBiodata(){
		System.out.println("::: Biodata :::");
		System.out.println("Nama : "+nama);
		System.out.println("Umur : "+umur);
	}
	public Mahasiswa(String namaBaru, int umurBaru){
		nama = namaBaru;
		umur = umurBaru;
	}
	public String getNama(){
		return nama;
	}
	public String setNama(String n){
		return nama = n;
	}
	public int getUmur(){
		return umur;
	}
	public int setUmur(int u){
		return umur = u;
	}
	
}