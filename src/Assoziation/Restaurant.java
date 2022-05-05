package Assoziation;

public class Restaurant {
    private String name;
    private Kunde kunde;

    private Raum[] raeume;


    public Restaurant (String pName, Kunde pKunde){
        this.setKunde(pKunde);
        this.setName(pName);
        // Komposition <- Objekt muss hier initialisiert werden + bei Arrays oder Listen gibt es k
        // keine klassische getMethode

        raeume = new Raum[5];
        raeume[0] = new Raum(100);
    }

    public Restaurant(){
         // Komposition
         // Komposition <- Objekt muss hier initialisiert werden + bei Arrays oder Listen gibt es k
        // keine klassische getMethode
         raeume = new Raum[5];  
         raeume[0] = new Raum(100);  
    }


    public Kunde getKunde(){
        return this.kunde;
    }

    public void setKunde(Kunde pKunde){
        this.kunde = pKunde;
    }


    public void setName(String pName){
        this.name = pName;
    }

    public String getName(){
        return this.name;
    }


    public Raum getRaeume(int pNummer){
        return this.raeume[pNummer];
    }


    public void addRaum(Raum pRaum, int pNummer){
        this.raeume[pNummer] = pRaum;
    }



}
