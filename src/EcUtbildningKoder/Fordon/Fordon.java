package EcUtbildningKoder.Fordon;

public abstract class Fordon {
    private int hjul;
    private int årsmodell;
    //private int ägare;

    public Fordon() {
        hjul = 0;
        årsmodell = 0;
       // ägare = 0;

    }

    public Fordon(int hjul, int årsmodell) {
        setHjul(hjul);
        setÅrsmodell(årsmodell);


    }
    public String toString (){
       String s = String.format("Fordon: Antal Hjul:%d Årsmodell:%d", getHjul(), getÅrsmodell());
       return s;
    }

    public void setHjul(int hjul) {
        this.hjul = hjul;
    }

    public int getHjul() {
        return hjul;
    }

    public void setÅrsmodell(int årsmodell) {
        this.årsmodell = årsmodell;
    }

    public int getÅrsmodell() {
        return årsmodell;
    }
    public int acceleration(){
        int acceleration= 0;
        return acceleration;
    }


}
