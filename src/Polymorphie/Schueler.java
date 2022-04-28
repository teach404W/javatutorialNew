package Polymorphie;

public class Schueler extends Person{
    private String lieblingspokemon;


    public Schueler(String pName, int pAlter, String pPokemon){
        super(pName, pAlter);
        this.lieblingspokemon = pPokemon;
    }

    public String toString(){
        return super.toString() + " Pokemon: " + this.lieblingspokemon;
    }
}
