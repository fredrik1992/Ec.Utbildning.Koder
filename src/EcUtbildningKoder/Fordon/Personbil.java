package EcUtbildningKoder.Fordon;

public class Personbil extends Motorfordon {

    private String färg;

    public Personbil() {
        färg = "null";


    }

    public Personbil(int hjul,int årsmodell,int hästkrafter, int serienummer,String färg) {
        setFärg(färg);



    }
    @Override
    public String toString (){
        String s = String.format("%s Färg:%s",super.toString(),getFärg());
        return s;
    }



    public void setFärg(String färg) {
        this.färg = färg;
    }

    public String getFärg() {
        return färg;
    }
}
