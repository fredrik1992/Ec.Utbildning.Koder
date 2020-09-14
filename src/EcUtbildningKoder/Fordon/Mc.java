package EcUtbildningKoder.Fordon;

public class Mc extends Motorfordon {
    private String sideCarrier;


    public Mc() {
        sideCarrier = "null";


    }

    public Mc(int hjul,int årsmodell,int hästkrafter, int serienummer,String sideCarrier) {
        super(hjul,årsmodell,hästkrafter,serienummer);
        setSideCarrier(sideCarrier);



    }
    @Override
    public String toString (){
        String s = String.format("Mc:%s Sidecarrier:%s",super.toString(),getSideCarrier());
        return s;
    }

    public void setSideCarrier(String sideCarrier) {
        this.sideCarrier = sideCarrier;
    }

    public String getSideCarrier() {
        return sideCarrier;
    }


}
