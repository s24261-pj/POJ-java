package main;

public class Buzka implements PrzedstawiaEmocje, Rysowalny {
    char c;

    public Buzka(char c) {
        this.c = c;
    }

    @Override
    public boolean czySieUsmiecha() {
        return this.c == ')';
    }

    @Override
    public void przestanSieUsmiechac() {
        this.c = '(';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return ":-" + this.c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Buzka buzka = (Buzka) o;
        return c == buzka.c;
    }
}
