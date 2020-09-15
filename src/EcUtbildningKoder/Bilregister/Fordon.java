package EcUtbildningKoder.Bilregister;

public class Fordon {
    private String märke;
    private int chassinummer;
    private String registreringsnummer;


    public Fordon() {
        märke = "null";
        chassinummer = 0;
        registreringsnummer = "null";

    }

    public Fordon(String märke, int chassinummer, String registreringsnummer) {
        setMärke(märke);
        setChassinummer(chassinummer);
        setRegistreringsnummer(registreringsnummer);
    }

    public String toString(){
        String s = String.format("Märke:%s Chasssinummer:%d Registreringsnummer:%S"
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

    public void setRegistreringsnummer(String registreringsnummer) {
        this.registreringsnummer = registreringsnummer;
    }

    public String getRegistreringsnummer() {
        return registreringsnummer;
    }

}
