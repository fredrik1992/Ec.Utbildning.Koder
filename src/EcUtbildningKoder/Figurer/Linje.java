//Author:Fredrik Granath
//Datum:11 September 2020
//se cirkel för detaljerad info

package EcUtbildningKoder.Figurer;

public class Linje extends Figurer {

    private int linje;


    public Linje() {
        linje = 10;
    }

    public Linje(int y, int x, int bredd, int linje) {
        super(y, x, bredd);
        setLinje(linje);

    }

    @Override
    public String toString() {
        String s = String.format("Linjen har %s och linje:%d", super.toString(), getLinje());
        return s;
    }

    void setLinje(int linje) {
        if (linje >= 0)
            this.linje = linje;
    }

    int getLinje() {
        return linje;
    }
}

