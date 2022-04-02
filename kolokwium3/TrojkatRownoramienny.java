package exam;

public class TrojkatRownoramienny {
    private double base;
    private double arm;

    public TrojkatRownoramienny(double base, double arm) {
        setBase(base);
        setArm(arm);
    }

    public TrojkatRownoramienny(double base) {
        setBase(base);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getArm() {
        return arm;
    }

    public void setArm(double arm) {
        this.arm = arm;
    }

    public double wysokosc() {
        return Math.sqrt(getArm() * getArm()) - (getBase() * getBase() / 4.);
    }

    public double wysokosc(double a) {
        return (Math.sqrt((getArm() * getArm()) - (getBase() * getBase() / 4.)) * a);
    }

    public double wysokosc(int a) {
        return (Math.sqrt((getArm() * getArm()) - (getBase() * getBase() / 4.)) * a);
    }
}
