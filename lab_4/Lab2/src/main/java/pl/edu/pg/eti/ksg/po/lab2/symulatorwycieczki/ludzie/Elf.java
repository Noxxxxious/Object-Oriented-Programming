package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.ludzie;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;
import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy.Rivendell;

public class Elf extends Czlowiek{

    public Elf(String imie, String nazwisko, Plec plec) {
        super(imie, nazwisko, plec, 4.0);
    }

    protected Elf(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc) {
        super(imie, nazwisko, plec, maksymalnaPredkosc);
    }

    protected Elf(String imie, String nazwisko, Plec plec, double maksymalnaPredkosc, double czasPelnejRegeneracji, double czasPelnegoZmeczenia) {
        super(imie, nazwisko, plec, maksymalnaPredkosc, czasPelnejRegeneracji, czasPelnegoZmeczenia);
    }

    @Override
    public void reagujNaAtrakcje(Atrakcja a, double czas) {
        if(a instanceof Rivendell){
            regeneruj(czas);
            mow("To nie jest zwykly straznik. To Aragorn syn Arathorna. Jestescie mu winni swoja lojalnosc");
        }
        else
        super.reagujNaAtrakcje(a, czas);
    }

    @Override
    public int getUmiejetnosciNawigacyjne() {
        return 5;
    }

}

