package com.bagus.project;

/**
 * Created by Bagus on 6/11/2015.
 */
public class TestMain {
    public static void main(String[] args) {
        Gitar arif = new Gitar("Yamaha","Akustik","Coklat",2000000.0);

        Pengrajin bagus = new Pengrajin("Bagus Purnomo","Jalan Gajahmada",19,'L',"Jomblo",arif);
        System.out.println(bagus.toString());
    }
}
