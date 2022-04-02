package exam;

public class TrojkatRownoboczny extends TrojkatRownoramienny {
    public TrojkatRownoboczny(double base) {
        super(base);
    }

    public TrojkatRownoboczny(double base, double secondBase) {
        super(base, secondBase);
    }

    public double wysokosc() {
        return (getBase() * Math.sqrt(3)) / 2;
    }

    public double wysokosc(int a) {
        return (int)((getBase() * Math.sqrt(3) / 2.) * a);
    }

    public boolean equals(Object obj) {
        final TrojkatRownoramienny trojkat = (TrojkatRownoramienny) obj;

        return trojkat.wysokosc() == this.wysokosc();
    }
}
