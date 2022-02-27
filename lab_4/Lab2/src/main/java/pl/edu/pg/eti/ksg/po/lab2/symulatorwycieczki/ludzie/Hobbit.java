package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.Hobbiton;

public class Hobbit extends Czlowiek{

    public Hobbit(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 3.0);
    }

    protected Hobbit(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected Hobbit(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        if(w instanceof Hobbiton){
            aktualizujZmeczenie(czas);
            mow("Jeszcze krok i bede dalej od domu niz kiedykolwiek w zyciu");
        }
        else
        super.reagujNaWedrowke(w, czas);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 2;
    }

}

