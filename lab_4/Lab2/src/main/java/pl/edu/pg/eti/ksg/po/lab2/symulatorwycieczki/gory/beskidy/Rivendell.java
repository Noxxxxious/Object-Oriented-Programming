package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class Rivendell extends Atrakcja {

    public Rivendell(String nazwa) {
        super(nazwa);
        setDlugosc(0.75);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0;
    }

    @Override
    public String getNazwa() {
        return "Rivendell, "+super.getNazwa();
    }

}
