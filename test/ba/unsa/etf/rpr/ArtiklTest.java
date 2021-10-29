package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {

    @Test
    void setNaziv() {
        Artikl artikl = new Artikl("Sos",2,"98765432");
       artikl.setNaziv("Špagete");
       assertEquals("Špagete",artikl.getNaziv());
    }

    @Test
    void setKod() {
        Artikl artikl = new Artikl("Coca-Cola",2,"777654");
        artikl.setKod("777654");
        assertEquals("777654",artikl.getKod());
    }

    @Test
    void setCijena() {
        Artikl artikl = new Artikl("Pegla", 100,"4");
        artikl.setCijena(98);
        assertEquals(98,artikl.getCijena());
    }

    @Test
    void getNaziv() {
        Artikl artikl = new Artikl("Sir",3,"45678912");
        assertEquals("Sir",artikl.getNaziv());
    }

    @Test
    void getKod() {
        Artikl artikl = new Artikl("Tuna",5,"22233344");
        assertEquals("22233344",artikl.getKod());
    }

    @Test
    void getCijena() {
        Artikl artikl = new Artikl("Sol",2,"999952613");
        assertEquals(2,artikl.getCijena());
    }
}