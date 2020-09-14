package EcUtbildningKoder.Bilregister;

import java.lang.invoke.MutableCallSite;

public class Mc extends Fordon {
    private int kubik;

    public Mc() {
        kubik = 0;
    }

    public Mc(String märke, int chassinummer, int registreringsnummer, int kubik) {

        super(märke, chassinummer, registreringsnummer);
        setKubik(kubik);
    }

    public String toString() {
        String s = String.format("%s and Kubik:%d", super.toString(), getKubik());
        return s;
    }


    public void setKubik(int kubik) {
        this.kubik = kubik;
    }

    public int getKubik() {
        return kubik;
    }
}


