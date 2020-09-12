package EcUtbildningKoder.Uppgifter1_80;

public class uppgift40 {
    public static void main(String[] args) {
        int x = -10;
        float f;

        while (-10 <= x && x < 10) {

            f = 3*x*x*x-5*x*x+2*x-20;
            System.out.printf("%.2f\n",f);
            x =x+1;
        }


    }
}
