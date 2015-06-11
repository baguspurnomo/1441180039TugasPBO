package com.bagus.project;

/**
 * Created by Bagus on 6/11/2015.
 */
public class Pengrajin {
    private String namaPengrajin;
    private String alamatPengrajin;
    private int umurPengrajin;
    private char jenisKelamin;
    private String status;

    public Pengrajin(String namaPengrajin, String alamatPengrajin, int umurPengrajin) {
        this.namaPengrajin = namaPengrajin;
        this.alamatPengrajin = alamatPengrajin;
        this.umurPengrajin = umurPengrajin;
    }

    public Pengrajin(String namaPengrajin, String alamatPengrajin, int umurPengrajin, char jenisKelamin, String status) {
        this.namaPengrajin = namaPengrajin;
        this.alamatPengrajin = alamatPengrajin;
        this.umurPengrajin = umurPengrajin;
        this.jenisKelamin = jenisKelamin;
        this.status = status;
    }

    public String getNamaPengrajin() {
        return namaPengrajin;
    }

    public void setNamaPengrajin(String namaPengrajin) {
        this.namaPengrajin = namaPengrajin;
    }

    public String getAlamatPengrajin() {
        return alamatPengrajin;
    }

    public void setAlamatPengrajin(String alamatPengrajin) {
        this.alamatPengrajin = alamatPengrajin;
    }

    public int getUmurPengrajin() {
        return umurPengrajin;
    }

    public void setUmurPengrajin(int umurPengrajin) {
        this.umurPengrajin = umurPengrajin;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Pengrajin{" +
                "namaPengrajin='" + namaPengrajin + '\'' +
                ", alamatPengrajin='" + alamatPengrajin + '\'' +
                ", umurPengrajin=" + umurPengrajin +
                ", jenisKelamin=" + jenisKelamin +
                ", status='" + status + '\'' +
                '}';
    }
}
