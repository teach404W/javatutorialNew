package Polymorphie;


public class Person {
    private String name;
    private int alter;

    public Person(String pName, int pAlter){
        setName(pName);
        setAlter(pAlter);
    }

    public void setName(String pName) {
        name = pName;
    }

    public void setAlter(int pAlter) {
        this.alter = pAlter;
    }

    public String getName(){
        return name;
    }

    public int getAlter(){
        return this.alter;
    }


    public String toString(){
        return this.getClass() + ": Name: " + getName() + " Alter: " + getAlter();
    }
}
