package ch.hslu.oop.sw01;

/**
 * Beschreiben Sie hier die Klasse Student.
 *
 * @author (Ihr Name)
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Student {
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int alter;
    private String name;
    private String nummer;
    private boolean hungrig;
    private boolean hasWork;

    /**
     * Konstruktor für die Klasse Student
     *
     * @param name   der Name des Students
     * @param nummer die Nummer des Students
     * @param alter  das Alter des Students
     */
    public Student(String name, String nummer, int alter) {
        // Instanzvariable initialisieren
        this.name = name;
        this.nummer = nummer;
        this.alter = alter;
        this.hungrig = false;
        this.hasWork = false;
    }

    public boolean getHungrig() {
        return hungrig;
    }

    public void setHungrig(boolean hungrig) {
        this.hungrig = hungrig;
    }

    public boolean getWork() {
        return hasWork;
    }

    public void setWork(boolean hasWork) {
        this.hasWork = hasWork;
    }
}
