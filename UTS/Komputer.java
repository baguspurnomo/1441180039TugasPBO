class Komputer{
	int prosesor = 500;
	int memori;
	int storage;

		public int Komputer(){
			return prosesor;
		}

	
	
}

class Notebook extends Komputer {
 	int prosesor;
	int baterai;
Komputer kom = new Komputer();
public Notebook(int prosesorin, int memoriin, int storagein, int bateraiin){
		prosesor = prosesorin;
		memori = memoriin;
		storage = storagein;
		baterai = bateraiin;
		}

		void CetakSpesifikasi(){
			System.out.println("kecepatan prosesor Komputer : "+ kom.Komputer());
			System.out.println("kecepatan prosesor notebook : "+ prosesor);
			System.out.println("Kapasitas memori : "+ memori);
			System.out.println("Kapasitas storage : "+ storage);
			System.out.println("Kapasitas baterai : "+ baterai);
		}
		void Overclock(int prosesor){
			System.out.println("dioverclock dengan kecepatan prosesor : "+ prosesor);


		}
	}