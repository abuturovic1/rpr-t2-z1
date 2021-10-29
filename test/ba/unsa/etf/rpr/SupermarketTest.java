package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void getArtikli() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1 = new Artikl("Peškir",4,"5");
        Artikl artikl2 = new Artikl("Ubrusi",2,"7");
        Artikl artikl3 = new Artikl("Šampon",3,"9");
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);
        supermarket.dodajArtikl(artikl3);
        assertEquals(artikl3,supermarket.getArtikli()[2]);

    }

    @Test
    void izbaciArtiklSaKodom() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1 = new Artikl("Cipele1",300,"12");
        Artikl artikl2 = new Artikl("Cipele2",260,"32");
        supermarket.dodajArtikl(artikl1);
        supermarket.dodajArtikl(artikl2);

        assertEquals(artikl1,supermarket.izbaciArtiklSaKodom("12"));
    }

    @Test
    void dodajArtikl() {
        Supermarket supermarket = new Supermarket();
        Artikl artikl1 = new Artikl("Maramice",1,"3");
        supermarket.dodajArtikl(artikl1);
        Artikl artikl2 = new Artikl("Kutija",2,"8");
        supermarket.dodajArtikl(artikl2);
        assertEquals(artikl1,supermarket.getArtikli()[0]);

    }
}