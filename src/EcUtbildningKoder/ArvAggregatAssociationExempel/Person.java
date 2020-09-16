package EcUtbildningKoder.ArvAggregatAssociationExempel;
//2020/09/16
//Fredrik Granath

public class Person {
   private String namn;//inkapsling skyddar namn.Stringen namn är ett aggregat.

    public Person(){
        this.namn = "NN";
    }
    public Person(String namn){
        setNamn(namn);
    }

    public void setNamn(String n){
        this.namn = n;
    }
    public String getNamn(){
        return this.namn;
    }

}
