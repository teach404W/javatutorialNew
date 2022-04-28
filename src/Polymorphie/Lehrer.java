package Polymorphie;

public class Lehrer extends Person{
    private String[] faecher = new String[5];

    public Lehrer(String pName, int pAlter){
        // Konstruktor der klasse Person
        super(pName, pAlter);
    }



    public String[] getFaecher() {
        return this.faecher;
    }

    public void addFach(String pFach){
        for (int i = 0 ; i< faecher.length; i++){
            if (faecher[i] == null){
                faecher[i] = pFach;
                return;
            }
        }
    }

    public String toString(){
        return super.toString() + "\nFächer: " + getFaecherToString();
    }


    private String getFaecherToString(){
        String ret = "";
        for (String fach : faecher) {
            if(fach != null){
                ret = ret + " ; " + fach;  
            } 
        }
        if (ret.equals("")){
            return "---";
        }else{
            return ret;
        }

        
    }

}
