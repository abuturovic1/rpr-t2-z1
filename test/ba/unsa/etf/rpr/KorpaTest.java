package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtikl() {
        Korpa korpa=new Korpa();
        Artikl artikl = new Artikl("Mlijeko",3,"584693");
        korpa.dodajArtikl(artikl);
        assertEquals(3,korpa.dajUkupnuCijenuArtikala());
    }

    @Test
    void getArtikli() {
        Korpa korpa = new Korpa();
        Artikl artikl1=new Artikl("Čokolada",2,"741");
        Artikl artikl2=new Artikl("Šećer",2,"1234");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        assertEquals(artikl2,korpa.getArtikli()[1]);
    }

    @Test
    void izbaciArtiklSaKodom() {
        Korpa korpa = new Korpa();
        Artikl artikl1 = new Artikl("Milka",2,"25631");
        Artikl artikl2 = new Artikl("Dorina",2,"41752");
        Artikl artikl3 = new Artikl("RitterSport",3,"14011");
        Artikl artikl4 = new Artikl("Toblerone",3,"85243");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        korpa.dodajArtikl(artikl3);
        korpa.dodajArtikl(artikl4);
        assertEquals(artikl2, korpa.izbaciArtiklSaKodom("41752"));
    }

    @Test
    void dajUkupnuCijenuArtikala() {
        Korpa korpa = new Korpa();
        Artikl artikl1=new Artikl("Sapun",2,"65432");
        Artikl artikl2=new Artikl("Maramice",1,"41257");
        korpa.dodajArtikl(artikl1);
        korpa.dodajArtikl(artikl2);
        assertEquals(3, korpa.dajUkupnuCijenuArtikala());
    }
}