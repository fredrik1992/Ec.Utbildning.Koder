package EcUtbildningKoder.Fordon;

public class Cykel extends Fordon {
    private int ramnummer;



    public Cykel() {
        ramnummer = 0;



    }

    public Cykel(int hjul,int årsmodell,int ramnummer) {
        super(hjul,årsmodell);
        setRamnummer(ramnummer);



    }

    @Override
    public String toString (){
        String s = String.format("%s Ramnummer:%d",super.toString(),getRamnummer());
        return s;
    }
    public void setRamnummer(int ramnummer) {
        this.ramnummer = ramnummer;
    }

    public int getRamnummer() {
        return ramnummer;
    }




}
