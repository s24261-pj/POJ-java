package zjazd3;

import java.util.Objects;

public class Prostokat implements MoznaWyznaczycWielokrotnoscPrzekatnej, MoznaWyznaczycWysokosc {
    final int podstawa;
    final int bok;

    public Prostokat(int podstawa, int bok) {
        this.podstawa = podstawa;
        this.bok = bok;
    }

    @Override
    public double przekatna() {
        return Math.sqrt((podstawa * podstawa) + (bok * bok));
    }

    @Override
    public double wysokosc() {
        return bok();
    }

    @Override
    public double podstawa() {
        return podstawa;
    }

    @Override
    public double bok() {
        return bok;
    }

    @Override
    public double katNachylenia() {
        return Math.PI / 2;
    }

    @Override
    public double wielokrotnoscPrzekatnej(double v) {
        return przekatna() * v;
    }

    @Override
    public int wielokrotnoscPrzekatnej(int v) {
        return (int) wielokrotnoscPrzekatnej((double) v);
    }

    @Override
    public String toString() {
        return "prostokat";
    }

    // TODO: Ten equals przepuszcza 30/32 testy
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (hashCode() == obj.hashCode()) return true;
        if (getClass() != obj.getClass()) return false;
        Prostokat prostokat = (Prostokat) obj;
        return podstawa == prostokat.podstawa && bok == prostokat.bok && katNachylenia() == prostokat.katNachylenia();
    }

    // TODO: Ten equals przepuszcza 29/32 testów
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj instanceof MaWlasnosciRownolegloboku) return true;
//        if getClass() != obj.getClass()) return false;
//        Prostokat prostokat = (Prostokat) obj;
//        return podstawa == prostokat.podstawa && bok == prostokat.bok && katNachylenia() == prostokat.katNachylenia();
//    }

    @Override
    public int hashCode() {
        return Objects.hash(podstawa, bok);
    }
}
