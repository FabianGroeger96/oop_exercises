package ch.hslu.oop.sw06.Polymorphie;

public class Quecksilber extends Element {

    public Quecksilber(double temp){
        super(temp, -38.83, 357);
    }

    @Override
    public String toString() {
        return super.toString() + "GIFTIG";
    }
}
