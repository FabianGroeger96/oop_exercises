package ch.hslu.oop.sw03;

/**
 * Aufgabe Klassen und Datentypen
 * 
 * @author Fabian Gröger
 * @version 26.09.2017
 */
public class Temperatur
{
    // Instanzvariable
    private double tempCelsius;
    
    public Temperatur() {
        // Instanzvariable initialisieren
        this.tempCelsius = 20;
    }
    
    public Temperatur(double temp) {
        this.tempCelsius = temp;
    }
    
    public double getTempCelsius() {
        return this.tempCelsius;
    }
    
    public void setTempCelsius(double temp) {
        this.tempCelsius = temp;
    }
    
    public double getTempKelvin() {
        return this.tempCelsius + 273.15;
    }
    
    public void setTempKelvin(double temp) {
        this.tempCelsius = temp - 273.15;
    }
    
    public double getTempFahrenheit() {
        return this.tempCelsius * 1.8 + 32;
    }
    
    public void setTempFahrenheit(double temp) {
        this.tempCelsius = (temp - 32) / 1.8;
    }
    
    private String getAggregatsZu(double schmelzpunkt, double siedepunkt) {
        if(this.tempCelsius <= schmelzpunkt) {
            return "fest";
        } else if (this.tempCelsius >= siedepunkt) {
            return "gasförmig";
        } else {
            return "flüssig";
        }
    }
    
    public String getAggregatsZu(String elementBez) {
        switch (elementBez){
            case "N":
                return getAggregatsZu(-210.1, -196);
            case "Hg":
                return getAggregatsZu(-38.83, 357);
            case "Pb":
                return getAggregatsZu(327.43, 1744);
            default:
                return "Element noch nicht implementiert";
        }
    }
}
