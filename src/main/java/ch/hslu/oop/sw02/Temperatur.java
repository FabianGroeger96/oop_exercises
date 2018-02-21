package ch.hslu.oop.sw02;

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
}
