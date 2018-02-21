package ch.hslu.oop.sw05;

public abstract class Element {

    private Temperatur temp;
    private double schmelzpunkt;
    private double siedepunkt;

    public Element(double temp, double schmelzpunkt, double siedepunkt){
        this.temp.setTempCelsius(temp);
        this.schmelzpunkt = schmelzpunkt;
        this.siedepunkt = siedepunkt;
    }

    public Element(Temperatur temp, double schmelzpunkt, double siedepunkt){
        this(temp.getTempCelsius(), schmelzpunkt, siedepunkt);
    }

    public void setTemp(double temp){
        this.temp.setTempCelsius(temp);
    }

    public void setTemp(Temperatur temp){
        setTemp(temp.getTempCelsius());
    }

    public double getTemp(){
        return this.temp.getTempCelsius();
    }

    /**
     * Gibt den Aggregats Zustand durch die Instanzvariablen Schmelz- und Siedepunkt zurück.
     *
     * @return     den Aggregats Zustand.
     */
    private String getAggregatsZu() {
        if(this.temp.getTempCelsius() <= this.schmelzpunkt) {
            return "fest";
        } else if (this.temp.getTempCelsius() >= this.siedepunkt) {
            return "gasförmig";
        } else {
            return "flüssig";
        }
    }
}
