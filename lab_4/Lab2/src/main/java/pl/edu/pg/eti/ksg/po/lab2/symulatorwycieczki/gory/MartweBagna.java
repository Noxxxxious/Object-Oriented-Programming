package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class MartweBagna extends Wedrowka{

    public MartweBagna(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 4;
    }

    @Override
    public String getNazwa() {
        return "Martwe Bagna";
    }

}
