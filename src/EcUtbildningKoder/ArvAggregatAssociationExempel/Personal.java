package EcUtbildningKoder.ArvAggregatAssociationExempel;

public class Personal extends Person {

    private String anstNr;
    private int lön;

    public Personal() {  //ett anrop sker automatiskt till super classens default konstruktor
        this.anstNr = "Ej satt";
        this.lön = 0;
    }


    public Personal(String namn ,String anstNr, int lön) {
        super(namn);
        setAnstNr(anstNr);
        setLön(lön);

    }

    public void setAnstNr(String anstNr) {
        this.anstNr = anstNr;


    }

    public String getAnstNr() {
        return this.anstNr;
    }

    public void setLön(int lön) {
        this.lön = lön;


    }

    public int getLön() {
        return this.lön;
    }

}
