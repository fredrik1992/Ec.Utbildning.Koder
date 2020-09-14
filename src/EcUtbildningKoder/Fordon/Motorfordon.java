package EcUtbildningKoder.Fordon;

public class Motorfordon extends Fordon {
    private int hästkrafter;
    private int serienummer;

    public Motorfordon() {
        hästkrafter = 0;
        serienummer = 0;


    }

    public Motorfordon(int hjul,int årsmodell,int hästkrafter, int serienummer) {
        super(hjul,årsmodell);
        setHästkrafter(hästkrafter);
        setSerienummer(serienummer);


    }
    @Override
    public String toString (){
        String s = String.format("%s Hästkrafter:%d Årsmodell:%d",super.toString(),getHästkrafter(), getSerienummer());
        return s;
    }


    public void setHästkrafter(int hästkrafter) {
        this.hästkrafter = hästkrafter;
    }

    public int getHästkrafter() {
        return hästkrafter;
    }

    public void setSerienummer(int serienummer) {
        this.serienummer = serienummer;
    }

    public int getSerienummer() {
        return serienummer;
    }


}
