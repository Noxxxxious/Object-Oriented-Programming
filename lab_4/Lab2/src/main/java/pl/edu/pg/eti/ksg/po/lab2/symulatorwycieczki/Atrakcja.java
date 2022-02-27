package pl.edu.pg.eti.ksg.po.lab2.symulatorwycieczki;

public abstract class Atrakcja implements ElementWycieczki{
    private double dlugosc;
    private String nazwa;

    public Atrakcja(){}
    public Atrakcja(String nazwa) { this.nazwa = nazwa; }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getDlugosc(){
        return dlugosc;
    }

    public abstract double modyfikujPredkoscGrupy(double predkosc);
}
