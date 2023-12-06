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
    public int CalcolaPeimetro(){
        return (base + altezza)*2;
    }

    //Metodo calcola Area
    public int CalcolaArea(){
        return base * altezza;
    }

    //Metodo Grafico Rettangolo
    public String GraphicRettangolo(){
        String graphicRettangolo = "o" + "\t";
        for (int i = 0; i < base -1; i++) {
            graphicRettangolo = graphicRettangolo + "o" +"\t";
        }
        graphicRettangolo = graphicRettangolo +"\n";
        for (int i = 0; i < altezza-2 ; i++) {
            graphicRettangolo = graphicRettangolo + "o";
            for (int j = 0; j < base -1; j++) {
                graphicRettangolo = graphicRettangolo + " " + "\t";
            }
            graphicRettangolo = graphicRettangolo + "o" + "\n";
        }
        for (int i = 0; i < base; i++) {
            graphicRettangolo = graphicRettangolo +  "o" + "\t";
        }

        return graphicRettangolo;


    }

    //Override per stampa rettangolo
    @Override
    public String toString() {
        String Graphic = GraphicRettangolo();
        return "Rettangolo"+"\n-------------\n" +
                "Altezza = " + getAltezza() +"\n"+
                "Base = " + getBase() +"\n"+
                "Perimetro = "+CalcolaPeimetro()+"\n"+
                "Area = "+CalcolaArea()+"\n"+
                "\n"+"Ecco la grafica del tuo rettangolo : \n"+Graphic+"\n-------------";
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

