package at.cb.schiffeversenken;

import java.util.Scanner;

/* Autor: Schuh Michael
 * Datum: 19.8.2021
 * letze Änderung:
 * Version: 0.1
 * Beschreibung: Programm zum Erstellen und Spielen von Schiffe versenken
 */
public class Schiffeversenken {

    boolean horizontal;
    boolean vertical;
    int auswahl, auswahl1;
    int versuch = 0;
    String startposition;
    String [][]matches = new String[10][10];

    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Schiffeversenken sv = new Schiffeversenken();
        sv.test();
    }

    public void test() {
        while(true) {
            eingabe();
            spiel(matches);
            print(matches);
        }
    }

    public void eingabe() {
        System.out.format("+--------------------+--------------+%n");
        System.out.format("|Schiffart           |Eingabe       |%n");
        System.out.format("|Boat                |0             |%n");
        System.out.format("|Carrier             |1             |%n");
        System.out.format("|Submarine           |2             |%n");
        System.out.format("|Cruiser             |3             |%n");
        System.out.format("|Destroyer           |4             |%n");
        System.out.format("|Beenden             |5             |%n");
        auswahl = in.nextInt();
        if(auswahl == 5){
            System.exit(0);
        }
        if (versuch == 0) {
            grund(matches);
            versuch++;
        }
        print(matches);
        System.out.println("Wählen Sie die Startposition");
        startposition = in.next();
        System.out.format("+--------------------+--------------+%n");
        System.out.format("|Richtung            |Eingabe       |%n");
        System.out.format("|horizontal          |1             |%n");
        System.out.format("|vertikal            |2             |%n");
        auswahl1 = in.nextInt();
        if(auswahl1 == 1){
            horizontal = true;
        }else if(auswahl1 == 2){
            vertical = true;
        }else{
            System.out.println("Eingabe nicht erkannt");
        }
    }


    public void spiel(String [][]matches){
        for(int i = 0; i < matches.length; i++){
            for(int j = 0; j < matches.length; j++){
                matches[i][j] = " ";
            }
        }
        int zahl = Schiffe.values()[auswahl].getLänge();
        if(horizontal == true) {
            switch (startposition) {
                case "A":
                    matches[0][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[0][i] = "o";
                    }
                    break;
                case "B":
                    matches[1][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[1][i] = "o";
                    }
                    break;
                case "C":
                    matches[2][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[2][i] = "o";
                    }
                    break;
                case "D":
                    matches[3][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[3][i] = "o";
                    }
                    break;
                case "E":
                    matches[4][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[4][i] = "o";
                    }
                    break;
                case "F":
                    matches[5][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[5][i] = "o";
                    }
                    break;
                case "G":
                    matches[6][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[6][i] = "o";
                    }
                    break;
                case "H":
                    matches[7][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[7][i] = "o";
                    }
                    break;
                case "I":
                    matches[8][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[8][i] = "o";
                    }
                    break;
                case "J":
                    matches[9][0] = "o";
                    for (int i = zahl; i < matches.length; i++) {
                        matches[9][i] = "o";
                    }
                    break;
            }
        }
        if(vertical == true) {
            switch (startposition) {
                case "A":
                    matches[0][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "B":
                    matches[1][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "C":
                    matches[2][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "D":
                    matches[3][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "E":
                    matches[4][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "F":
                    matches[5][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "G":
                    matches[6][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "H":
                    matches[7][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "I":
                    matches[8][0] = "o";
                    for (int i = 1; i < zahl; i++) {
                        matches[i][0] = "o";
                    }
                    break;
                case "J":
                    matches[9][0] = "o";
                    for (int i = zahl; i < matches.length; i++) {
                        matches[i][0] = "o";
                    }
                    break;
            }
        }
    }


    public void print(String [][]matches){
        int zaehler= 0;
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for(int i = 0; i < matches.length; i++){
            switch(zaehler){
                case 0: System.out.print("A ");
                break;
                case 1: System.out.print("B ");
                break;
                case 2: System.out.print("C ");
                break;
                case 3: System.out.print("D ");
                break;
                case 4: System.out.print("E ");
                break;
                case 5: System.out.print("F ");
                break;
                case 6: System.out.print("G ");
                break;
                case 7: System.out.print("H ");
                break;
                case 8: System.out.print("I ");
                break;
                case 9: System.out.print("J ");
            }
            for(int j = 0; j < matches.length; j++){
                System.out.print(matches[i][j] +"|");
            }
            System.out.println();
            zaehler++;
        }

    }

    public void grund(String[][]matches){
        for(int i = 0; i < matches.length; i++){
            for(int j = 0; j < matches.length; j++){
                matches[i][j] = " ";
            }
        }
    }

}
