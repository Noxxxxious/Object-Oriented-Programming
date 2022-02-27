package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class DrewnianaCerkiew extends Atrakcja {

    public DrewnianaCerkiew(String nazwa) {
        super(nazwa);
        setDlugosc(0.5);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0;
    }

    @Override
    public String getNazwa() {
        return "Drewniana Cerkiew";
    }

}
