package EcUtbildningKoder.Fordon;

public class main {
    public static void main(String[] args) {
        //Fordon fordon1 = new Fordon(0, 1992);
        Motorfordon motorfordon = new Motorfordon(0, 1992, 100, 000550);
        Mc mc = new Mc(2, 1992, 100, 000550, "ja");
        Cykel cykel = new Cykel(2, 1992, 00550);
        Personbil personbil = new Personbil(2, 1992, 800, 005203, "gul");


       // print(fordon1);
        print(motorfordon);
        print(mc);
        print(cykel);
        print(personbil);
    }

    public static void print(Fordon fordon) {
        System.out.printf("%s%n", fordon);
    }
}
