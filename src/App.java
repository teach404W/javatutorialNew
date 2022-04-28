import Polymorphie.Lehrer;
import Polymorphie.Person;
import Polymorphie.Schueler;

public class App {
    public static void main(String[] args) throws Exception {
       
        Person[] personenLager = new Person[10];

        personenLager[0] = new Person("Maarten",  17);
        personenLager[1] = new Person("Peter",  14);
        personenLager[2] = new Person("Stella",  17);
    

        personenLager[3] = new Lehrer("Felix", 34);
        ((Lehrer) personenLager[3]).addFach("Informatik");
        ((Lehrer) personenLager[3]).addFach("Mathematik");

        personenLager[4] = new Schueler("Abakus", 10000, "Karpador");
        
        for (int i = 0; i < personenLager.length ; i++){
            if (personenLager[i] != null){
                System.out.println(personenLager[i]);
            }
          
        }

    }
}
