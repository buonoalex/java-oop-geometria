package org.lessons.java.geometria;

public class Rettangolo {

    private int altezza;
    private int base;

    //Costruttore Personale
    public Rettangolo(int altezza,int base){
        this.setAltezza(altezza);
        this.setBase(base);
    }

    //Costruttore Default
    public Rettangolo(){

    }

    //Metodo Calcola Perimetro
    public int CalcolaPeimetro(int altezza,int base){
        return (base + altezza)*2;
    }

    //Metodo calcola Area
    public int CalcolaArea(int altezza,int base){
        return base * altezza;
    }

    //Override per stampa rettangolo
    @Override
    public String toString() {
        return "Rettangolo"+"\n-------------\n" +
                "Altezza = " + getAltezza() +"\n"+
                "Base = " + getBase() +"\n"+
                "Perimetro = "+CalcolaPeimetro(getAltezza(),getBase())+"\n"+
                "Area = "+CalcolaArea(getAltezza(),getBase())+"\n"+
                "-------------";
    }

    //Getter and Setter
    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

}

