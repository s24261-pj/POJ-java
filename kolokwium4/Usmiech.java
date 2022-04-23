package main;

public class Usmiech extends Buzka implements Skalowalny {

    public Usmiech() {
        super(')');
    }

    @Override
    public void draw(int i) {
        System.out.print(toString());
        if (i > 1)
            System.out.print(")".repeat(i - 1));
        System.out.println();
    }

    @Override
    public void draw() {
        System.out.println(toString());;
    }

    @Override
    public String toString() {
        return ":-)";
    }

    @Override
    public boolean czySieUsmiecha() {
        return true;
    }

    @Override
    public void przestanSieUsmiechac() {

    }
}
