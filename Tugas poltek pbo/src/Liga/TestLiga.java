package Liga;

/**
 * Created by Bagus on 7/5/2015.
 */
public class TestLiga {

    public static void main(String[] args) {

        Liga spanyol = new Liga("spanyol");

        Divisi adelente = new Divisi("Divisi adelente");
        Divisi bbva = new Divisi("BBVA");

        Klub bbva1 = new Klub("fc barcelona",bbva,spanyol);
        Klub bbva2 = new Klub("atletico madrid",bbva, spanyol);
        Klub adelente1 = new Klub("espanyol b",adelente,spanyol);
        Klub adelente2 = new Klub("Granada",adelente, spanyol);

        spanyol.setDaftarDivisi(adelente);
        spanyol.setDaftarDivisi(bbva);

        spanyol.setDaftarKlub(bbva1);
        spanyol.setDaftarKlub(bbva2);
        spanyol.setDaftarKlub(adelente1);
        spanyol.setDaftarKlub(adelente2);

        bbva.setDaftarKlub(bbva1);
        bbva.setDaftarKlub(bbva2);
        adelente.setDaftarKlub(adelente1);
        adelente.setDaftarKlub(adelente2);
        System.out.println("1");
        System.out.println("Liga : " +spanyol.getNamaLiga());
        System.out.println("Divisi : " +spanyol.getDaftarDivisi());

        System.out.println("\n");
        System.out.println("2");

        System.out.println("Liga : " +spanyol.getNamaLiga());
        System.out.println("Klub : " +spanyol.getDaftarKlub());
        System.out.println("\n");
        System.out.println("3");
        System.out.println("Liga : " +spanyol.getNamaLiga());
        System.out.println("Klub : " +adelente.getDaftarKlub());
        System.out.println("\n");
        System.out.println("4");
        System.out.println("Liga : " +spanyol.getNamaLiga());
        System.out.println("Klub : " +bbva.getDaftarKlub());
        System.out.println("\n");
        System.out.println("5");
        System.out.println("Liga : " +spanyol.getNamaLiga());
        System.out.println("Klub : " +spanyol.getDaftarKlub());
        System.out.println("\n");
        System.out.println("6");
        System.out.println("Liga : " +bbva1.getLiga());
        System.out.println("Klub : " +bbva1.getNamaKlub());
        System.out.println("Divisi : " +bbva1.getDivisi());
        System.out.println("\n");
        System.out.println("7");
        System.out.println("Liga : " +bbva2.getLiga());
        System.out.println("Klub : " +bbva2.getNamaKlub());
        System.out.println("Divisi : " +bbva2.getDivisi());
        System.out.println("\n");
        System.out.println("8");
        System.out.println("Liga : " + adelente1.getLiga());
        System.out.println("Klub : " + adelente1.getNamaKlub());
        System.out.println("Divisi : " + adelente1.getDivisi());
        System.out.println("\n");
        System.out.println("9");
        System.out.println("Liga : " + adelente2.getLiga());
        System.out.println("Klub : " + adelente2.getNamaKlub());
        System.out.println("Divisi : " + adelente2.getDivisi());
        System.out.println("\n");
    }
}

