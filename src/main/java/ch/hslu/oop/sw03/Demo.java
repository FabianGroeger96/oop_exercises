package ch.hslu.oop.sw03;

/**
 * Beschreiben Sie hier die Klasse Demo.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Demo
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    //private int x;

    /**
     * Konstruktor für Objekte der Klasse Demo
     */
    public Demo()
    {
        // Instanzvariable initialisieren
        //x = 0;
    }

    public int max(final int a, final int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public int min(final int a, final int b) {
        if(a < b) {
            return a;
        } else {
            return b;
        }
    }
    
    public int max(final int a, final int b, final int c) {
        int tempMax = max(a,b);
        if(tempMax > c) {
            return tempMax;
        } else {
            return c;
        }
    }
    
    public int min(final int a, final int b, final int c) {
        int tempMin = min(a,b);
        if(tempMin > c) {
            return tempMin;
        } else {
            return c;
        }
    }
    
    public void forZeroTen() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
    
    public void whileZeroTen() {
        int i = 0;
        
        while(i <= 10) {
            System.out.println(i);
            i++;
        }
    }
    
    public void dowhileZeroTen() {
        int i = 0;
        
        do {
            System.out.println(i);
            i++;
        } while(i <= 10);
    }
    
    public void floatAddition() {
        float i = 0.9f;
        int counter = 0;
        
        while(i <= 1.0f) {
            System.out.println(i);
            i += 0.000025f;
            counter++;
        }
        
        System.out.println("Final value " + i);
        System.out.println("Counter " + counter);
    }
    
    public void floatAdditionFor() {
        float i = 0.9f;
        int counter = 0;
        
        for(counter = 0; counter < 4000; counter++) {
            System.out.println(i);
            i += 0.000025f;
        }
        
        System.out.println("Final value " + i);
        System.out.println("Counter " + counter);
    }
    
    public void printBox(final int height, final int width) {
        
        for(int h = 1; h <= height; h++) {
            if(h == 1 || h == height){
                for(int w = 1; w <= width; w++) {
                    if(w == width) {
                        System.out.println("#");
                    } else {
                        System.out.print("#");
                    }
                }
            } else {
                for(int w = 1; w <= width; w++) {
                    if(w == 1) {
                        System.out.print("#");
                    } else if(w == width) {
                        System.out.println("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
        
        
    }
}
