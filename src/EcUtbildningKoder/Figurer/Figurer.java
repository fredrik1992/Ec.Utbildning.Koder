package EcUtbildningKoder.Figurer;
//Author Fredrik
//11September
//Detta är en genomgång av superclasser och subclasser och hur dom fungerar.

public class Figurer {//superclassen
    private int x;
    private int y;
    private int bredd; //ska ligga först ,deklarera medlems variabler

    public Figurer() {//default constructor
        x = 10;
        y = 10;
        bredd = 2;

    }

    public Figurer(int x, int y, int bredd) {//constructor med 3 parametrar
        setX(x);
        setY(y);
        setBredd(bredd);

    }


    public String toString() {//det är här  ifrån subclassernas call till
        //super.tostring hämtar sitt värde
        String s;
        s = String.format("x:%d och y:%d samt bredd:%d", getx(), getY(), getBredd());
        return s;

    }


    public void setX(int x) {
        if (x >= 0) {
            this.x = x;
        }

    }

    public int getx() {
        return x;
    }

    public void setY(int y) {
        if (y >= 0) {
            this.y = y;
        }

    }

    public int getY() {
        return y;
    }

    public void setBredd(int b) {
        if (b >= 0) {
            bredd = b;
        }

    }

    public int getBredd() {
        return bredd;
    }
}
