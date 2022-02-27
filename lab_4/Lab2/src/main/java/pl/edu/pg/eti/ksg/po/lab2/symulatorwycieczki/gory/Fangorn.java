package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Wedrowka;

public class Fangorn extends Wedrowka{

    public Fangorn(double odleglosc) {
        super(odleglosc);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return predkosc;
    }

    @Override
    public int getTrudnoscNawigacyjna() {
        return 2;
    }

    @Override
    public String getNazwa() {
        return "Fangorn";
    }

}