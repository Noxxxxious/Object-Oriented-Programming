package pl.edu.pg.eti.ksg.po.lab2;

import java.util.HashSet;
import java.util.Set;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Grupa;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.SymulatorWycieczki;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Uczestnik;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wycieczka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.*;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.BaradDur;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.DrewnianaCerkiew;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.MinasTirith;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.Rivendell;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie.*;


public class JavaLab2 {
    public static void main(String[] args) {
        /*Wycieczka w = doDydiowki();
        
        PrzewodnikStudencki przewodnik = new PrzewodnikStudencki("Stefan", "Długonogi", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new Student("Alojzy", "Mechanik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Student("Ada", "Lovelace", Czlowiek.Plec.KOBIETA));
        uczestnicy.add(new Student("Jan", "Elektronik", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new StudentKSG("Piotr","Teledetekcyjny", Czlowiek.Plec.MEZCZYZNA));
        
        Grupa g = new Grupa(przewodnik, uczestnicy);
        
        SymulatorWycieczki symulator = new SymulatorWycieczki(g, w);
        
        symulator.symuluj();*/

        Wycieczka w = wycieczkaPoSródziemiu();
        PrzewodnikStudencki przewodnik = new PrzewodnikStudencki("Gandalf", "Szary", Czlowiek.Plec.MEZCZYZNA);
        Set<Uczestnik> uczestnicy = new HashSet<>();
        uczestnicy.add(new Hobbit("Frodo", "Baggins", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Atan("Aragorn", "Elessar", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Krasnolud("Gimli", "syn Gloina", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Elf("Legolas","Thranduilion", Czlowiek.Plec.MEZCZYZNA));
        uczestnicy.add(new Hobbit("Samwise","Gamgee", Czlowiek.Plec.MEZCZYZNA));

        Grupa g = new Grupa(przewodnik, uczestnicy);

        SymulatorWycieczki symulator = new SymulatorWycieczki(g, w);

        symulator.symuluj();
    }
    
    public static Wycieczka doDydiowki() {
        Wycieczka ret = new Wycieczka("Do Dydiówki");
        ret.dodajElementWycieczki(new Droga(1.0));
        ret.dodajElementWycieczki(new DrewnianaCerkiew("Smolnik"));
        ret.dodajElementWycieczki(new Droga(4.0));
//        ret.dodajElementWycieczki(new PrzeprawaPrzezRzeke(1.0));
//        ret.dodajElementWycieczki(new GestyLas(2.0));
        ret.dodajElementWycieczki(new Las(2.0));
        ret.dodajElementWycieczki(new Droga(5.0));
        
        return ret;
    }

    public static Wycieczka wycieczkaPoSródziemiu() {
        Wycieczka ret = new Wycieczka("Na Górę Przeznaczenia");
        ret.dodajElementWycieczki(new Hobbiton(3.0));
        ret.dodajElementWycieczki(new Rivendell("Dom Elronda"));
        ret.dodajElementWycieczki(new KopalnieMorii(2.0));
        ret.dodajElementWycieczki(new Fangorn(4.0));
        ret.dodajElementWycieczki(new MartweBagna(5.0));
        ret.dodajElementWycieczki(new MinasTirith("Twierdza Gondoru"));
        ret.dodajElementWycieczki(new Mordor(3.0));
        ret.dodajElementWycieczki(new BaradDur("Oko Saurona"));

        return ret;
    }
   
}
