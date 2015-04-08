//Example to illustrate method overloading 
public class  testmethodoverloading {
	public static int average(int nSatu, int nDua){		//A
		return (nSatu+nDua)/2;

	}
	public static double average(double nSatu, double nDua){ // B
		return (nSatu+nDua)/2;

	}
	public static double average(int nSatu, int nDua, int nTiga){ // C
		return (nSatu+nDua+nTiga)/3;

	}

	public static  void main(String[] args) {
		System.out.println(average(1, 2));			// A
		System.out.println(average(1.0, 2.0));		// B
		System.out.println(average(1, 2, 3));		// C
		System.out.println(average(1.0, 2));		// D
	}
	
}