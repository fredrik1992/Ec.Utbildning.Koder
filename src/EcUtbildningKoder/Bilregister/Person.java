package EcUtbildningKoder.Bilregister;

public class Person {

    private String namn;
    private String personnumer;


    public Person(){
        namn = "null";
        personnumer = "null";
    }
    public Person(String namn , String personnumer){
        setNamn(namn);
        setPersonnumer(personnumer);
    }
    public String toString(){
        String s = String.format("Namn:%s Personummer:%s",namn,personnumer);
                return s;

        }


    public void setNamn(String namn){
        this.namn = namn;
    }
    public String getNamn(){
        return namn;
    }
    public void setPersonnumer(String personnumer){
        this.personnumer = personnumer;
    }
    public String getPersonnumer(){
        return personnumer;
    }


    //ska inehålla  namn personummer och utrskrift för det
}
