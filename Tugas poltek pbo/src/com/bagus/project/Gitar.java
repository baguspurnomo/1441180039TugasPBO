package com.bagus.project;

/**
 * Created by Bagus on 6/11/2015.
 */
public class Gitar {
    private String merekGitar;
    private String jenisGitar;
    private String warnaGitar;
    private Double hargaGitar;

    public Gitar(String merekGitar, String jenisGitar) {
        this.merekGitar = merekGitar;
        this.jenisGitar = jenisGitar;
    }

    public Gitar(String merekGitar, String jenisGitar, String warnaGitar, Double hargaGitar) {
        this.merekGitar = merekGitar;
        this.jenisGitar = jenisGitar;
        this.warnaGitar = warnaGitar;
        this.hargaGitar = hargaGitar;
    }

    public String getMerekGitar() {
        return merekGitar;
    }

    public void setMerekGitar(String merekGitar) {
        this.merekGitar = merekGitar;
    }

    public String getJenisGitar() {
        return jenisGitar;
    }

    public void setJenisGitar(String jenisGitar) {
        this.jenisGitar = jenisGitar;
    }

    public String getWarnaGitar() {
        return warnaGitar;
    }

    public void setWarnaGitar(String warnaGitar) {
        this.warnaGitar = warnaGitar;
    }

    public Double getHargaGitar() {
        return hargaGitar;
    }

    public void setHargaGitar(Double hargaGitar) {
        this.hargaGitar = hargaGitar;
    }

    @Override
    public String toString() {
        return "Gitar{" +
                "merekGitar='" + merekGitar + '\'' +
                ", jenisGitar='" + jenisGitar + '\'' +
                ", warnaGitar='" + warnaGitar + '\'' +
                ", hargaGitar=" + hargaGitar +
                '}';
    }
}
