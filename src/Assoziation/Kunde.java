package Assoziation;

public class Kunde {
    private String name;


    public Kunde (String pName){
        this.setName(pName);
    }




    public void setName(String pName){
        this.name = pName;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return "Kunde: " + this.name;
    }
}
