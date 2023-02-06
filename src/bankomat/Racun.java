/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankomat;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Racun {
    
    int stanjeNaRacunu;
    int prethodnaTransakcija;
    String imeKorisnika;
    String idBrojKorisnika;

    // Konstruktor klase

    Racun(String imeK, String idBrK){
        imeKorisnika = imeK;
        idBrojKorisnika = idBrK;
    }

    // Funkcija za uplatu sredstva na racun

    void uplataNaRacun(int kolicinaNovca){
        if (kolicinaNovca != 0){
            stanjeNaRacunu = stanjeNaRacunu + kolicinaNovca;
            prethodnaTransakcija = kolicinaNovca;

        }
    }

    // Funkcija za podizanje sredstva sa racuna

    void podizanjeSaRacuna(int kolicinaNovca){
        if (kolicinaNovca != 0){
            stanjeNaRacunu = stanjeNaRacunu - kolicinaNovca;
            prethodnaTransakcija = -kolicinaNovca;

        }
    }

    // Funkcija za prikazivanje prethodne transakcije

    void prikaziPrethodnuTransakciju(){
        if (prethodnaTransakcija > 0){
            System.out.println("Prethodna uplata na racun: " + prethodnaTransakcija);
        } else if (prethodnaTransakcija < 0) {
            System.out.println("Prethodno podignut novac sa racuna: " + Math.abs(prethodnaTransakcija));


        }else {
            System.out.println("Transakcija se nije izvrsila");
        }
    }

    // Funkcija za racunanje kamatne stope nakon n broja godina
    void izracunatiKamatnuStopu(int godine){

        double kamatnaStopa = 0.150;
        double novoStanjeNaRacunu = (stanjeNaRacunu * kamatnaStopa * godine) + stanjeNaRacunu;

        System.out.println("Trenutna kamatna stopa iznosi: " + (100 * kamatnaStopa) + "%");
        System.out.println("Nakon " + godine + " godina kamatna stopa ce iznositi: " + novoStanjeNaRacunu);
    }

    // Funkcija za prikazivanje glavnog menija

    void prikazatiMeni(){
        char opcija = '\0';
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dobrodosli , " + imeKorisnika);
        System.out.println("Vas korisnicki ID: " + idBrojKorisnika);
        System.out.println();
        System.out.println("Sta želite da uradite?");
        System.out.println();
        System.out.println("1. Stanje na racunu");
        System.out.println("2. Uplata novca na racun");
        System.out.println("3. Podizanje novca sa racuna");
        System.out.println("4. Pogledajte prethodnu transakciju");
        System.out.println("5. Izracunati kamatnu stopu");
        System.out.println("6. Izlaz");

        do {
            System.out.println();
            System.out.println("Izaberite opciju: ");
            char opcija1 = scanner.next().charAt(0);
            opcija = Character.toUpperCase(opcija1);
            System.out.println();

            switch (opcija){

                // Izbor 1 omogucava korisniku da proveri stanje na racunu

                case '1':
                    System.out.println("=================================");
                    System.out.println("Stanje na racunu: " + stanjeNaRacunu);
                    System.out.println("=================================");
                    System.out.println();
                    break;

                    // Izbor 2 omogucava korisniku da uplati novac na racun

                case '2':
                    System.out.println("Unesite kolicinu novca koju uplacujete: ");
                    int kolicinaNovca = scanner.nextInt();
                    uplataNaRacun(kolicinaNovca);
                    System.out.println();
                    break;

                    // Izbor 3 omogucava korisniku da podigne novac sa racuna

                case '3':
                    System.out.println("Unesite iznos novca koji zelite da podignete: ");
                    int kolicinaNovca2 = scanner.nextInt();
                    podizanjeSaRacuna(kolicinaNovca2);
                    System.out.println();
                    break;

                    // Izbor 4 omogucava korisniku da pogleda svoju prethodnu transakciju

                case '4':
                    System.out.println("=================================");
                    prikaziPrethodnuTransakciju();
                    System.out.println("=================================");
                    System.out.println();
                    break;

                    // Izbor 5 omogucava korisniku da izracuna kamatnu stopu nakon n broja godina

                case '5':
                    System.out.println("Unesite za koliko godina zelite da izracunate kamatnu stopu: ");
                    int brojGodina = scanner.nextInt();
                    izracunatiKamatnuStopu(brojGodina);
                    break;

                    // Izbor 6 omogucava korisniku da izadje iz menija

                case '6':
                    System.out.println("=================================");
                    break;

                    // Default koji obavestava korisnika o gresci o unosu

                default:
                    System.out.println("Doslo je do greske. Molimo unesite opciju od 1 - 6");
                    break;
            }


        }while (opcija != '6');
            System.out.println("Hvala na poverenju!");
        }


    }

    
    
    

