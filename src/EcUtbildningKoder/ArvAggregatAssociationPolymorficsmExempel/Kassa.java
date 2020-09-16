package EcUtbildningKoder.ArvAggregatAssociationPolymorficsmExempel;

public class Kassa {
    private Kortterminal kortterminal; //aggregat
              //class   //medlemsvariabel
    public Kassa(){
        kortterminal = new Kortterminal();//måste läggas i varje konstruktor.
    }

}
