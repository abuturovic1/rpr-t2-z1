package ba.unsa.etf.rpr;

public class Supermarket {
    private Artikl[] artikli=new Artikl[1000];
    private int b;
    public Artikl[] getArtikli(){
        return artikli;
    }
    public Artikl izbaciArtiklSaKodom(String kod){
        for(int i=1;i<=b;i++){
            if(artikli[i].getKod().equals(kod)){
                Artikl a=artikli[i];
                for(int j=i;j<b-1;j++){
                    artikli[j]=artikli[j+1];
                }
                artikli[b-1]=null;
                b--;
                return a;
            }
        }
        return null;
    }
    public void dodajArtikl(Artikl a){
        artikli[b]=a;
        b++;
    }
}
