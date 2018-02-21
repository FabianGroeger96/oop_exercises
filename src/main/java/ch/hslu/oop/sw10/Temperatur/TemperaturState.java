package ch.hslu.oop.sw10.Temperatur;

public enum TemperaturState {
    MIN("Minimum"), MAX("Maximum");

    private final String text;

    private TemperaturState(final String zustand){
        this.text = zustand;
    }

    public String getText(){
        return this.text;
    }
}
