package EcUtbildningKoder.Figurer;

public class main {
    public static void main(String[] args) {


        Kvadrat figur1 = new Kvadrat(300, 5, 300, 4, 790);
        Cirkel figur2 = new Cirkel(300, 200, 50, 40);
        Linje figur3 = new Linje(300, 399, 5, 10);


        System.out.println(figur1.toString());

        System.out.println(figur2.toString());


        System.out.println(figur3.toString());


    }
}
