package ch.hslu.oop.sw10.Auto;

public class Licht implements Switchable {

    private int lumen;

    public Licht(){
        this.lumen = 0;
    }

    @Override
    public void switchOn() {
        this.lumen = 30;
    }

    @Override
    public void switchOff() {
        this.lumen = 0;
    }

    @Override
    public boolean isSwitchedOn() {
        if(this.lumen > 0){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isSwitchedOff() {
        if(this.lumen == 0){
            return true;
        } else {
            return false;
        }
    }
}
