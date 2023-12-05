package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Apro Scanner
        Scanner myBroScan = new Scanner(System.in);

        //Variabili
        int altezza;
        int base;

        //Input
        System.out.println("Inserisci la dimensione della base del rettangolo : ");
        base = Integer.parseInt(myBroScan.nextLine());

        System.out.println("Inserisci la dimensione dell'altezza del rettangolo : ");
        altezza = Integer.parseInt(myBroScan.nextLine());

        //Accesso a oggetto e Creazione
        Rettangolo rett1 = new Rettangolo(altezza,base);




        //Chiudo Scanner
        myBroScan.close();

    }
}
