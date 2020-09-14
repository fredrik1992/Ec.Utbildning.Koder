package EcUtbildningKoder.Bilregister;

public class Fordon {
    private String märke;
    private int chassinummer;
    private int registreringsnummer;


    public Fordon() {
        märke = "null";
        chassinummer = 0;
        registreringsnummer = 0;

    }

    public Fordon(String märke, int chassinummer, int registreringsnummer) {
        setMärke(märke);
        setChassinummer(chassinummer);
        setRegistreringsnummer(registreringsnummer);
    }

    public String toString(){
        String s = String.format("Märke:%s Chasssinummer:%d Registreringsnummer:%d"
                ,getMärke(),getChassinummer(),getRegistreringsnummer());
        return s;
    }

    public void setMärke(String märke) {
        this.märke = märke;


    }

    public String getMärke() {
        return märke;
    }

    public void setChassinummer(int chassinummer) {
        this.chassinummer = chassinummer;
    }

    public int getChassinummer() {
        return chassinummer;
    }

    public void setRegistreringsnummer(int registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    public int getRegistreringsnummer() {
        return registreringsnummer;
    }

}
