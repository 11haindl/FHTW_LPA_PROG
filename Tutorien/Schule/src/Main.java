import at.fhtw.lpa.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static List<Schueler> schueler = new ArrayList<>();
    public static List<Mitarbeiter> mitarbeiter = new ArrayList<>();
    public static List<Klasse> klassen = new ArrayList<>();

    public static void main(String[] args) {

        initDemoData();
        printKlassen(klassen);
        printMitarbeiter(mitarbeiter);
        printSchueler(getBestSchueler());

    }

    public static void printKlassen(List<Klasse> klassen){
        for(Klasse klasse : klassen){
            printKlasse(klasse);
        }
        System.out.printf("-------------------------------------------------------------------------------------\n\n");
    }

    public static void printKlasse(Klasse klasse){
        System.out.println(klasse.getBezeichnung() + " (" + klasse.getLehrer().getVorname() + " " + klasse.getLehrer().getNachname() + "): " + klasse.getSchuelerList().size() + " Schüler");
    }

    public static Schueler getBestSchueler(){
        Schueler bestSchueler = schueler.get(0);
        for (Schueler s : schueler){
            //System.out.println("best: " + bestSchueler.getNotendurchschnitt() + "    " +  s.getNachname() + ": " + s.getNotendurchschnitt());
            if(s.getNotendurchschnitt() < bestSchueler.getNotendurchschnitt()){
                bestSchueler = s;
            }
        }
        return bestSchueler;
    }

    public static void printSchueler(Schueler schueler){
        System.out.println(schueler.getVorname() + " " + schueler.getNachname() + " (Klasse " + schueler.getKlasse().getBezeichnung() + "), " + schueler.getNoten().size() + " Noten, Notendurchschnitt: " + schueler.getNotendurchschnitt());
        System.out.printf("-------------------------------------------------------------------------------------\n\n");
    }

    public static void printMitarbeiter(List<Mitarbeiter> mitarbeiter){
        for (Mitarbeiter ma : mitarbeiter){
            printMitarbeiter(ma);
        }
        System.out.printf("-------------------------------------------------------------------------------------\n\n");
    }

    public static void printMitarbeiter(Mitarbeiter mitarbeiter){
        if(mitarbeiter instanceof Lehrer){
            System.out.println("Lehrer " + ((Lehrer) mitarbeiter).getVorname() + " " + ((Lehrer) mitarbeiter).getNachname() + " (Klasse " + ((Lehrer) mitarbeiter).getKlasse().getBezeichnung() + "), " + ((Lehrer) mitarbeiter).geturlaubsanspruch() + " Tage Urlaub, " + ((Lehrer) mitarbeiter).getJahresgehalt() + " Jahresgehalt");
        }
        if (mitarbeiter instanceof  Hilfskraft){
            System.out.println("Hilfskraft " + ((Hilfskraft) mitarbeiter).getVorname() + " " + ((Hilfskraft) mitarbeiter).getNachname() + ", " + ((Hilfskraft) mitarbeiter).geturlaubsanspruch() + " Tage Urlaub, " + ((Hilfskraft) mitarbeiter).getJahresgehalt() + " Jahresgehalt");
        }
    }

    public static void initDemoData(){

        Lehrer lehrer1 = new Lehrer("Martin", "Urbanz", 3738.59, 30, null);
        Lehrer lehrer2 = new Lehrer("Gerhard", "Jarz", 3880.13, 35, null);
        Lehrer lehrer3 = new Lehrer("Verana", "Rabel", 2926.44, 28, null);
        mitarbeiter.add(lehrer1);
        mitarbeiter.add(lehrer2);
        mitarbeiter.add(lehrer3);

        Hilfskraft hilfskraft1 = new Hilfskraft("Paul", "Mayer", 2578.14);
        Hilfskraft hilfskraft2 = new Hilfskraft("Anita", "Hauser", 2725.56);
        mitarbeiter.add(hilfskraft1);
        mitarbeiter.add(hilfskraft2);

        List<Schueler> schueler1a = new ArrayList<>();
        List<Schueler> schueler2a = new ArrayList<>();
        List<Schueler> schueler2b = new ArrayList<>();

        Klasse klasse1a = new Klasse("1A", lehrer1, schueler1a);
        Klasse klasse2a = new Klasse("2A", lehrer2, schueler2a);
        Klasse klasse2b = new Klasse("2B", lehrer3, schueler2b);
        lehrer1.setKlasse(klasse1a);
        lehrer2.setKlasse(klasse2a);
        lehrer3.setKlasse(klasse2b);
        klassen.add(klasse1a);
        klassen.add(klasse2a);
        klassen.add(klasse2b);

        // Schüler der Klasse 1a
        List<Note> notenSchueler1 = new ArrayList<>();
        notenSchueler1.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler1.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler1.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler1.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler1.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler1.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler1.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler1 = new Schueler("Andreas", "Diewald", klasse1a, notenSchueler1);
        schueler1a.add(schueler1);
        schueler.add(schueler1);

        List<Note> notenSchueler2 = new ArrayList<>();
        notenSchueler2.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler2.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler2.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler2.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler2.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler2.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler2.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler2 = new Schueler("Fereshte", "Dorodyan", klasse1a, notenSchueler2);
        schueler1a.add(schueler2);
        schueler.add(schueler2);

        List<Note> notenSchueler3 = new ArrayList<>();
        notenSchueler3.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler3.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler3.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler3.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler3.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler3.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler3.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler3 = new Schueler("Matthias", "Fleck", klasse1a, notenSchueler3);
        schueler1a.add(schueler3);
        schueler.add(schueler3);

        List<Note> notenSchueler4 = new ArrayList<>();
        notenSchueler4.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler4.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler4.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler4.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler4.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler4.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler4.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler4 = new Schueler("Puja", "Ghasemi", klasse1a, notenSchueler4);
        schueler1a.add(schueler4);
        schueler.add(schueler4);

        List<Note> notenSchueler5 = new ArrayList<>();
        notenSchueler5.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler5.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler5.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler5.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler5.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler5.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler5.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler5 = new Schueler("Thomas", "Grabner", klasse1a, notenSchueler5);
        schueler1a.add(schueler5);
        schueler.add(schueler5);

        List<Note> notenSchueler6 = new ArrayList<>();
        notenSchueler6.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler6.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler6.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler6.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler6.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler6.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler6.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler6 = new Schueler("Stefan", "Grubbauer", klasse1a, notenSchueler6);
        schueler1a.add(schueler6);
        schueler.add(schueler6);

        List<Note> notenSchueler7 = new ArrayList<>();
        notenSchueler7.add(new Note("Mathematik", 1));
        notenSchueler7.add(new Note("Deutsch", 3));
        notenSchueler7.add(new Note("Englisch", 2));
        notenSchueler7.add(new Note("Biologie", 3));
        notenSchueler7.add(new Note("Geografie", 3));
        notenSchueler7.add(new Note("Geschichte", 4));
        notenSchueler7.add(new Note("Informatik", 1));
        Schueler schueler7 = new Schueler("Stefanie", "Haindl", klasse1a, notenSchueler7);
        schueler1a.add(schueler7);
        schueler.add(schueler7);

        List<Note> notenSchueler8 = new ArrayList<>();
        notenSchueler8.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler8.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler8.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler8.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler8.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler8.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler8.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler8 = new Schueler("Nico", "Hödl", klasse1a, notenSchueler8);
        schueler1a.add(schueler8);
        schueler.add(schueler8);

        List<Note> notenSchueler9 = new ArrayList<>();
        notenSchueler9.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler9.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler9.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler9.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler9.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler9.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler9.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler9 = new Schueler("Dominic", "Horwath", klasse1a, notenSchueler9);
        schueler1a.add(schueler9);
        schueler.add(schueler9);

        List<Note> notenSchueler10 = new ArrayList<>();
        notenSchueler10.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler10.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler10.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler10.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler10.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler10.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler10.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler10 = new Schueler("Andreas", "Huber", klasse1a, notenSchueler10);
        schueler1a.add(schueler10);
        schueler.add(schueler10);

        List<Note> notenSchueler11 = new ArrayList<>();
        notenSchueler11.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler11.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler11.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler11.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler11.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler11.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler11.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler11 = new Schueler("Philipp", "Jammernegg", klasse1a, notenSchueler11);
        schueler1a.add(schueler11);
        schueler.add(schueler11);

        List<Note> notenSchueler12 = new ArrayList<>();
        notenSchueler12.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler12.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler12.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler12.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler12.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler12.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler12.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler12 = new Schueler("Alexander", "Jungbauer", klasse1a, notenSchueler12);
        schueler1a.add(schueler12);
        schueler.add(schueler12);



        // Schüler der Klasse 2a
        List<Note> notenSchueler13 = new ArrayList<>();
        notenSchueler13.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler13.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler13.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler13.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler13.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler13.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler13.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler13 = new Schueler("Daniela", "Krainer", klasse2a, notenSchueler13);
        schueler2a.add(schueler13);
        schueler.add(schueler13);

        List<Note> notenSchueler14 = new ArrayList<>();
        notenSchueler14.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler14.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler14.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler14.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler14.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler14.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler14.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler14 = new Schueler("Nicolai", "Marksl", klasse2a, notenSchueler14);
        schueler2a.add(schueler14);
        schueler.add(schueler14);

        List<Note> notenSchueler15 = new ArrayList<>();
        notenSchueler15.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler15.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler15.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler15.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler15.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler15.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler15.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler15 = new Schueler("Paul", "Rebene", klasse2a, notenSchueler15);
        schueler2a.add(schueler15);
        schueler.add(schueler15);

        List<Note> notenSchueler16 = new ArrayList<>();
        notenSchueler16.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler16.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler16.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler16.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler16.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler16.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler16.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler16 = new Schueler("Sebastian", "Schwarz", klasse2a, notenSchueler16);
        schueler2a.add(schueler16);
        schueler.add(schueler16);

        List<Note> notenSchueler17 = new ArrayList<>();
        notenSchueler17.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler17.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler17.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler17.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler17.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler17.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler17.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler17 = new Schueler("Peter", "Seebacher", klasse2a, notenSchueler17);
        schueler2a.add(schueler17);
        schueler.add(schueler17);

        List<Note> notenSchueler18 = new ArrayList<>();
        notenSchueler18.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler18.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler18.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler18.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler18.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler18.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler18.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler18 = new Schueler("Sebastian", "Tatsch", klasse2a, notenSchueler18);
        schueler2a.add(schueler18);
        schueler.add(schueler18);

        List<Note> notenSchueler19 = new ArrayList<>();
        notenSchueler19.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler19.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler19.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler19.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler19.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler19.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler19.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler19 = new Schueler("Christopher", "Tiran", klasse2a, notenSchueler19);
        schueler2a.add(schueler19);
        schueler.add(schueler19);

        List<Note> notenSchueler20 = new ArrayList<>();
        notenSchueler20.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler20.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler20.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler20.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler20.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler20.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler20.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler20 = new Schueler("Sabrina", "Trummer", klasse2a, notenSchueler20);
        schueler2a.add(schueler20);
        schueler.add(schueler20);

        List<Note> notenSchueler21 = new ArrayList<>();
        notenSchueler21.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler21.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler21.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler21.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler21.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler21.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler21.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler21 = new Schueler("Asmir", "Tutic", klasse2a, notenSchueler21);
        schueler2a.add(schueler21);
        schueler.add(schueler21);

        List<Note> notenSchueler22 = new ArrayList<>();
        notenSchueler22.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler22.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler22.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler22.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler22.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler22.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler22.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler22 = new Schueler("Valmir", "Valci", klasse2a, notenSchueler22);
        schueler2a.add(schueler22);
        schueler.add(schueler22);

        List<Note> notenSchueler23 = new ArrayList<>();
        notenSchueler23.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler23.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler23.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler23.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler23.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler23.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler23.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler23 = new Schueler("Jan", "Weghofer", klasse2a, notenSchueler23);
        schueler2a.add(schueler23);
        schueler.add(schueler23);


        // Schüler der Klasse 2a
        List<Note> notenSchueler24 = new ArrayList<>();
        notenSchueler24.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler24.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler24.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler24.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler24.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler24.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler24.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler24 = new Schueler("Martina", "Allmer", klasse2b, notenSchueler24);
        schueler2b.add(schueler24);
        schueler.add(schueler24);

        List<Note> notenSchueler25 = new ArrayList<>();
        notenSchueler25.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler25.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler25.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler25.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler25.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler25.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler25.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler25 = new Schueler("Livia", "Burtic", klasse2b, notenSchueler25);
        schueler2b.add(schueler25);
        schueler.add(schueler25);

        List<Note> notenSchueler26 = new ArrayList<>();
        notenSchueler26.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler26.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler26.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler26.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler26.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler26.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler26.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler26 = new Schueler("Christian", "Gilly", klasse2b, notenSchueler26);
        schueler2b.add(schueler26);
        schueler.add(schueler26);

        List<Note> notenSchueler27 = new ArrayList<>();
        notenSchueler27.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler27.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler27.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler27.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler27.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler27.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler27.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler27 = new Schueler("Max", "Greinix", klasse2b, notenSchueler27);
        schueler2b.add(schueler27);
        schueler.add(schueler27);

        List<Note> notenSchueler28 = new ArrayList<>();
        notenSchueler28.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler28.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler28.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler28.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler28.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler28.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler28.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler28 = new Schueler("Lea", "Hochberger", klasse2b, notenSchueler28);
        schueler2b.add(schueler28);
        schueler.add(schueler28);

        List<Note> notenSchueler29 = new ArrayList<>();
        notenSchueler29.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler29.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler29.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler29.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler29.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler29.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler29.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler29 = new Schueler("David", "Jursitzky", klasse2b, notenSchueler29);
        schueler2b.add(schueler29);
        schueler.add(schueler29);

        List<Note> notenSchueler30 = new ArrayList<>();
        notenSchueler30.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler30.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler30.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler30.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler30.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler30.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler30.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler30 = new Schueler("Michael", "Mussbacher", klasse2b, notenSchueler30);
        schueler2b.add(schueler30);
        schueler.add(schueler30);

        List<Note> notenSchueler31 = new ArrayList<>();
        notenSchueler31.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler31.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler31.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler31.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler31.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler31.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler31.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler31 = new Schueler("Stefan", "Pichler", klasse2b, notenSchueler31);
        schueler2b.add(schueler31);
        schueler.add(schueler31);

        List<Note> notenSchueler32 = new ArrayList<>();
        notenSchueler32.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler32.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler32.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler32.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler32.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler32.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler32.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler32 = new Schueler("Sascha", "Radler", klasse2b, notenSchueler32);
        schueler2b.add(schueler32);
        schueler.add(schueler32);

        List<Note> notenSchueler33 = new ArrayList<>();
        notenSchueler33.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler33.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler33.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler33.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler33.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler33.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler33.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler33 = new Schueler("Mario", "Supper", klasse2b, notenSchueler33);
        schueler2b.add(schueler33);
        schueler.add(schueler33);

        List<Note> notenSchueler34 = new ArrayList<>();
        notenSchueler34.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler34.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler34.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler34.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler34.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler34.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler34.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler34 = new Schueler("Daniel", "Theussl", klasse2b, notenSchueler34);
        schueler2b.add(schueler34);
        schueler.add(schueler34);

        List<Note> notenSchueler35 = new ArrayList<>();
        notenSchueler35.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler35.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler35.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler35.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler35.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler35.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler35.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler35 = new Schueler("Melissa", "Uhl", klasse2b, notenSchueler35);
        schueler2b.add(schueler35);
        schueler.add(schueler35);

        List<Note> notenSchueler36 = new ArrayList<>();
        notenSchueler36.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler36.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler36.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler36.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler36.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler36.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler36.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler36 = new Schueler("Martin", "Vogel", klasse2b, notenSchueler36);
        schueler2b.add(schueler36);
        schueler.add(schueler36);

        List<Note> notenSchueler37 = new ArrayList<>();
        notenSchueler37.add(new Note("Mathematik", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler37.add(new Note("Deutsch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler37.add(new Note("Englisch", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler37.add(new Note("Biologie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler37.add(new Note("Geografie", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler37.add(new Note("Geschichte", ThreadLocalRandom.current().nextInt(1, 6)));
        notenSchueler37.add(new Note("Informatik", ThreadLocalRandom.current().nextInt(1, 6)));
        Schueler schueler37 = new Schueler("Walter", "Ziegler", klasse2b, notenSchueler37);
        schueler2b.add(schueler37);
        schueler.add(schueler37);


    }
}
