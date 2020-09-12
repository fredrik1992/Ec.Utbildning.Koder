package EcUtbildningKoder.Uppgifter1_80;

public class uppgift38 {
    public static void main(String[] args) {
        int year = 2016;
        double residents = 2600;
        double birthed = 0.007;
        double dead = 0.006;

        while (year <= 2020) {
            residents = residents * (+1 + birthed - dead) + 320 - 300;
            System.out.printf("%.2f\n",residents);
            year = year + 1;
        }


    }
}
