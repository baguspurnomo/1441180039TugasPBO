package Liga;

import java.util.ArrayList;

/**
 * Created by Bagus on 7/5/2015.
 */
public class Divisi {
    private String namaDivisi;
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();
    public Divisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;

    }

    public String getNamaDivisi() {
        System.out.println("Nama Divisi");
        return namaDivisi;
    }

    public void setNamaDivisi(String namaDivisi) {
        this.namaDivisi = namaDivisi;
    }

    public ArrayList<Klub> getDaftarKlub() {
        System.out.println("Daftar Klub: ");
        return daftarKlub;
    }

    public void setDaftarKlub(Klub klub) {
        this.daftarKlub.add(klub);
    }

    @Override
    public String toString() {
        return "Divisi{" +
                "namaDivisi='" + namaDivisi + '\'' +
                '}';
    }

}

