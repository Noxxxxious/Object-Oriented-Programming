package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.MinasTirith;

public class Atan extends Czlowiek{

    public Atan(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 4.0);
    }

    protected Atan(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected Atan(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        if(a instanceof MinasTirith){
            regeneruj(czas);
            mow("Dziedzictwo moich przodkow");
        }
        else
        super.reagujNaAtrakcje(a, czas);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 4;
    }

}
