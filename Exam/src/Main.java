import at.fhtw.lpa.klausur.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    private static List<Konto> konten = new ArrayList<>();
    private static List<Kunde> kunden = new ArrayList<>();

    public static void main(String[] args) {
        initDemoData();
        printKonten(konten);
        printKunden(kunden);
        System.out.println(getKontoMitHoechstenKontostand());

    }

    public static void printKonten(Collection<Konto> konten){
        for (Konto konto : konten){
            printKonto(konto);
        }
    }

    public static void printKonto(Konto konto){
        System.out.println(konto);
    }

    public static void printKunden(Collection<Kunde> kunden){
        for(Kunde kunde : kunden){
            printKunde(kunde);
        }
    }

    public static void  printKunde(Kunde kunde){
        String konten = "";
        for(Konto konto : kunde.getKonten()){
            konten += konto.getIban() + " (" + konto.getClass().getSimpleName() + ")\n";
        }
        if (kunde instanceof Privatkunde){
            System.out.println(kunde + konten);
        }
    }

    public static Konto getKontoMitHoechstenKontostand(){
        Konto max = konten.get(0);
        for(Konto k : konten){
            if(max.getKontostand() < k.getKontostand()){
                max = k;
            }
        }
        return max;
    }

    public static void initDemoData(){
        Kunde k1 = new Privatkunde("Anna", "Musterfrau");
        Konto girokonto = new Girokonto("AT00786598324571", 3865.00f, k1, 1000);
        Konto termingeldkonto = new Termingeldkonto("AT00786598324573", 10000.00, k1, 0.02f, 24);
        k1.addKonto(girokonto);
        k1.addKonto(termingeldkonto);

        Kunde k2 = new Privatkunde("Max", "Mustermann");
        Konto girokonto2 = new Girokonto("AT00786598324577", 2500.00f, k2, 500.00f);
        Konto sparplankonto = new Sparplankonto("AT00786598324578", 10000.00f, k2, 0.02f, 24, 150.00f);
        k2.addKonto(girokonto2);
        k2.addKonto(sparplankonto);

        Kunde k3 = new Firmenkunde("Lagerhaus Tulln");
        Konto girokonto3 = new Girokonto("AT00786598324579", 5900.00f, k3, 5000.00f);
        k3.addKonto(girokonto3);

        kunden.add(k1);
        kunden.add(k2);
        kunden.add(k3);

        konten.add(girokonto);
        konten.add(termingeldkonto);
        konten.add(girokonto2);
        konten.add(sparplankonto);
        konten.add(girokonto3);
    }

    /*
    AT00786598324571 (Girokonto), Kontostand: 3865,00
o AT00786598324573 (Termingeldkonto), Kontostand: 10000,00, Zinssatz: 2,00%,
Laufzeit: 24 Monate, Prognose: 10.404,00
o AT00786598324578 (Sparplankonto), Kontostand: 10000,00, Zinssatz: 2,00%,
Laufzeit: 24 Monate, Sparplan: 150,00 monatlich, Prognose: 13.600,00
     */
}
