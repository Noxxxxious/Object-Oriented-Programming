package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.gory.beskidy;

import pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki.Atrakcja;

public class MinasTirith extends Atrakcja {

    public MinasTirith(String nazwa) {
        super(nazwa);
        setDlugosc(0.9);
    }

    @Override
    public double modyfikujPredkoscGrupy(double predkosc) {
        return 0;
    }

    @Override
    public String getNazwa() {
        return "Minas Tirith, "+super.getNazwa();
    }

}
