//Author:Fredrik Granath
//Datum:11 September 2020
//se cirkel för detaljerad info

package EcUtbildningKoder.Figurer;

public class Kvadrat extends Figurer {////arv extends
    private int slutY;
    private int slutX;

    public Kvadrat() {
        //ett automatiskt anrop till superklassens defaultkunstrktor
        slutX = 40;
        slutY = 40;
    }

    public Kvadrat(int x, int y, int b, int slutX, int slutY) {
        super(x, y, b);// skickar dessa värdena till superclassen
        setSlutX(slutX);
        setSlutY(slutY);
    }

    @Override
    public String toString() {
        String s = String.format("Kvadraten har %s sluty:%d slytx:/d", super.toString(), getSluty(), getSlutX());
        return s;
    }

    public void setSlutX(int x) {
        if (x >= 0) {
            slutX = x;
        }
    }

    public int getSlutX() {
        return slutX;
    }

    public void setSlutY(int y) {
        if (y >= 0) {
            slutY = y;
        }
    }

    public int getSluty() {
        return slutY;
    }


}
