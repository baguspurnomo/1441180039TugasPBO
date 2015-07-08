package Liga;

/**
 * Created by Bagus on 7/5/2015.
 */
public class TestLiga {

    public static void main(String[] args) {
        // membuat objek "namaKelas variabel = new namaKelas()
        Liga italy = new Liga("Italy");

        Divisi seriA = new Divisi("seriA");
        Divisi seriB = new Divisi("seriB");

        Klub acMilan = new Klub("ac Milan", seriA, italy);
        Klub acRoma = new Klub("ac Roma", seriA, italy);

        Klub parma = new Klub("ac Roma", seriB, italy);
        Klub fiorentina = new Klub("ac Roma", seriB, italy);

//        memanggil " kelas.setapa yang mau dipanggil;

        italy.setDaftarDivisi(seriA);
        italy.setDaftarDivisi(seriB);

        seriA.setDaftarKlub(acMilan);
        seriA.setDaftarKlub(acRoma);

        seriB.setDaftarKlub(parma);
        seriB.setDaftarKlub(fiorentina);

//        soal nomer 1. Get daftarDivisi by namaLiga

        italy.getDaftarDivisi();
        System.out.println("1");
        System.out.println(italy.getDaftarDivisi());
        System.out.println("");

//        soal nomer 2. Get daftarKlub by namaLiga
        italy.setDaftarKlub(acRoma);
        System.out.println("2");
        System.out.println(italy.getDaftarKlub());
        System.out.println("");

//        soal nomer 3. Get daftarKlub by namaDivisi
        System.out.println("3");
        System.out.println(seriA.getDaftarKlub());
        System.out.println("");

//        soal nomer 4. Get Klub ini berada di Divisi mana by namaKlub
        acMilan.getDivisi();
        acMilan.getNamaKlub();
        System.out.println("4");
        System.out.println(acMilan.getDivisi());
        System.out.println(acMilan.getNamaKlub());
        System.out.println("");

//        soal nomer 5.Get Klub ini berada di Liga apa by namaKlub
        acRoma.getLiga();
        acRoma.getNamaKlub();
        System.out.println("5");
        System.out.println(acRoma.getLiga());
        System.out.println(acRoma.getNamaKlub());
        System.out.println("");

        System.out.println("Ini Tugas saya pak");




    }

}
