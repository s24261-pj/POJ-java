package zjazd3;

public class Kwadrat extends Prostokat implements MoznaWyznaczycPrzekatna {
    public Kwadrat(int bok) {
        super(bok, bok);
    }

    public Kwadrat(int podstawa, int bok) {
        super(podstawa, bok);
    }

    @Override
    public String toString() {
        return "kwadrat";
    }
}
