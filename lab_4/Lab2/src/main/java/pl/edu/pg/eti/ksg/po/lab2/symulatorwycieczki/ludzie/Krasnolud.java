package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.KopalnieMorii;

public class Krasnolud extends Czlowiek{

    public Krasnolud(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 3.0);
    }

    protected Krasnolud(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected Krasnolud(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public void reagujNaWedrowke(Wedrowka w, double czas) {
        if(w instanceof KopalnieMorii){
            aktualizujZmeczenie(czas);
            mow("Niebawem zaznasz słynnej goscinnosci krasnoludow");
        }
        else
        super.reagujNaWedrowke(w, czas);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 3;
    }

}

