//Author:Fredrik Granath
//Datum:11September 2020
//skapar en subclass ifrån Figur klassen och lägger till radie värdet samt skriver ut det

package EcUtbildningKoder.Figurer;


public class Cirkel extends Figurer {//skapar en subclass ifrån figurer
    private int radie;//medlems variabel


    public Cirkel() {
        radie = 10;
    }//default constructor med givet värde till radie.
    //kallas om inga parametrar anges

    public Cirkel(int y, int x, int bredd, int radie) {// constructorn med parametrar
        super(y, x, bredd);//skickar upp variablarna y,x,bredd till superclassen
        setRadie(radie);

    }

    @Override
    public String toString() {//returnerar variablen s som inehåller värdet ifrån
        //superclassens metod tostring och get radie värdet.
        String s = String.format("Cirklen har %s radie:%d", super.toString(), getRadie());
        return s;
    }
    @Override
    public void rita() {
        System.out.println("nu ska vi rita en cirkel");


    }

    void setRadie(int radie) {// används för
        if (radie >= 0)
            this.radie = radie;
    }

    int getRadie() {
        return radie;
    }
}
