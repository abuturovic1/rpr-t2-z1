package ba.unsa.etf.rpr;

public class Korpa {
    private int puna = 0;
    private Artikl[] artikli = new Artikl[50];

    public boolean dodajArtikl(Artikl a) {
        if (puna < 50) {
            artikli[puna++] = a;

            return true;
        } else {
            System.out.println("Korpa je puna");
            return false;
        }


    }
    public Artikl[] getArtikli(){
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=1;i<=puna;i++){
            if(artikli[i].getKod().equals(kod)){
    Artikl pom=artikli[i];
    artikli[i]=artikli[puna-1];
    puna--;
    return pom;
            }
        }
        return null;
    }
    public int dajUkupnuCijenuArtikala(){
        int ukupna=0;
        for(int i=1;i<=puna;i++){
            ukupna=ukupna+artikli[i].getCijena();
        }
        return ukupna;
    }
}
