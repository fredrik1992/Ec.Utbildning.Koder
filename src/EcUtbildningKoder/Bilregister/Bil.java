package EcUtbildningKoder.Bilregister;

public class Bil extends Fordon{
    private  int platser;

    public Bil() {
        platser = 0;


    }

    public Bil(String märke, int chassinummer, int registreringsnummer,int platser) {
        super(märke,chassinummer,registreringsnummer);
        setPlatser(platser);

    }

    public String toString(){
        String s = String.format("%s Platser:%d",super.toString()
                ,getPlatser());
        return s;
    }

    public void setPlatser(int platser ) {
        this.platser = platser;


    }

    public int getPlatser() {
        return platser;
    }


}
