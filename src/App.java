import Assoziation.Kunde;
import Assoziation.Raum;
import Assoziation.Restaurant;
import Polymorphie.Lehrer;
import Polymorphie.Person;
import Polymorphie.Schueler;



public class App {
    public static void main(String[] args) throws Exception {
        //polymorphie();
        assoziation();


    }


    private static void assoziation(){
        Kunde k1 = new Kunde("Maarten");
        System.out.println(k1);
        Restaurant r1 = new Restaurant();
        r1.setKunde(k1);
        System.out.println(r1.getKunde());

        k1.setName("Martina");

        System.out.println(r1.getKunde());


        Restaurant r2 = new Restaurant("Hallel", new Kunde("Manuel"));

        System.out.println(r2.getKunde());



        //// Komposition
        System.out.println(r2.getRaeume(0).getqm2());

        r2.addRaum(new Raum(120), 3);

        System.out.println(r2.getRaeume(3).getqm2());

    }


    private static void polymorphie(){
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
                // Polymorphie
                System.out.println(personenLager[i]);
            }
          
        }
    }



}
