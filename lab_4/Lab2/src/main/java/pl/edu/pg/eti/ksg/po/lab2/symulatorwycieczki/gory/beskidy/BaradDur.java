package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class BaradDur extends Atrakcja {

    public BaradDur(String nazwa) {
        super(nazwa);
        setDlugosc(0.4);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0;
    }

    @Override
    public String getNazwa() {
        return "BaradDur, "+super.getNazwa();
    }

}
