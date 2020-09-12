package EcUtbildningKoder.Uppgifter1_80;

public class uppgift50 {
    public static void main(String[] args) {

        int x = 9;
        int n = 1;
        int tabell = 1;
        int result = 0;




        while (tabell <= 10) {
            while (n <= x) {
                result = n*tabell;
                System.out.println(n + " x " + tabell  + "= " + result);
                n = n + 1;

            }
            tabell =tabell+1;
            n=1;
        }

    }
}
