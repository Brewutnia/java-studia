package pl.pols.spd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //obiekt
       /* Kwadrat k1 = new Kwadrat();
        k1.bok = 5;
        System.out.println(k1.pole()); */

        Moneta m5 = new Moneta();
        int ileReszek=0;
        for (int i=0;i <10; i++){
            if (m5.rzut()=='r'){
                ileReszek++;
            }
        } System.out.println(ileReszek);




        //witaj();

        //oJedenWiecej();

        //wyswietl("Ala", 3);

        /*Scanner sc = new Scanner(System.in);
        double bok1 = sc.nextDouble();
        double bok2 = sc.nextDouble();
        poleProstokata(bok1,bok2);*/

        //int a = plusJeden(2);

       // System.out.println(pobierz());

    /*}

    public static void witaj() {
        for (int i = 0; i < 3; i++) {
            System.out.println("witaj");
        }
    }

    public static void oJedenWiecej() {
       *//* Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int liczba = sc.nextInt();
        System.out.println(liczba + 1);*//*

        Scanner scan = new Scanner(System.in);
        System.out.println("podaj liczbę");
        int liczba2 = scan.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.println("witaj");
            trzyRazy();
        }
    }

    public static void trzyRazy() {
        for (int i = 0; i < 3; i++) {
            System.out.println("witaj");
        }
    }

    public static void wyswietl(String napis, int ile) {
        for (int i = 0; i < ile; i++) {
            System.out.println(napis);
        }
    }
    public static void poleProstokata (double a, double b) {
        System.out.println(a*b);
    }

    public static int plusJeden(int liczba){
        return liczba+1;
    }
    public static int pobierz() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();*/
    }
}

