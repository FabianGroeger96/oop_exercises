package ch.hslu.oop.sw08.Elemente;

public enum  Aggregatszustaende {
    SOLID("fest"), LIQUID("flüssig"), GAS("gasförmig");

    private final String zustand;

    private Aggregatszustaende(final String zustand){
        this.zustand = zustand;
    }

    public String getZustand(){
        return this.zustand;
    }
}