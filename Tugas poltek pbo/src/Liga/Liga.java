package Liga;

import java.util.ArrayList;

/**
 * Created by Bagus on 7/5/2015.
 */
public class Liga {

    private String namaLiga;
    private Klub daftarKlub;
    ArrayList<Divisi>daftarDivisi = new ArrayList<Divisi>();
    ArrayList<Divisi>namaDivisi = new ArrayList<Divisi>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Liga(String namaLiga,Klub daftarKlub) {
        this.namaLiga = namaLiga;
        this.daftarKlub = daftarKlub;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public Klub getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub(Klub daftarKlub) {
        this.daftarKlub = daftarKlub;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi) {
        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Divisi> getNamaDivisi() {
        return namaDivisi;
    }

    public void setNamaDivisi(Divisi namadivisi) {
        this.namaDivisi.add(namadivisi);
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}