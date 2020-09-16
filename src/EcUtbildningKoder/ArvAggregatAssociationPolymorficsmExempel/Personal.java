package EcUtbildningKoder.ArvAggregatAssociationPolymorficsmExempel;

public class Personal extends Person { //ett anrop sker automatiskt till super classens default konstruktor
    private int lön;
    private String anstNr;



    public Personal(){
        lön = 0;
        anstNr = "None";
    }

    public Personal (int lön,String anstNr){
        setLön(lön);
    }






    @Override
    public void öppna(){
        System.out.println("jag är personal och öppnar med nyckel");
    }
    public void setAnstNr(String anstNr) {
        this.anstNr = anstNr;


    }

    public String getAnstNr() {
        return this.anstNr;
    }

    public void setLön(int lön){
        this.lön = lön;

    }
    public int getLön(){
        return lön;
    }
    public void betalning(){
        Kassa kassa = new Kassa();//Association
        //kassa.loggaIn() Exempel.
    }
}
