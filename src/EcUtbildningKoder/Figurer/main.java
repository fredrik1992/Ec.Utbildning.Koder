package EcUtbildningKoder.Figurer;

public class main {
    public static void main(String[] args) {
        Figurer[] figvekt = new Figurer[5];

        figvekt[0] = new Cirkel(5, 7, 2,50);
        figvekt[1] = new Kvadrat();
        figvekt[2] = new Linje();



        for (int i = 0; i < figvekt.length && figvekt[i] != null; i++) {//så länge det finns vektor platser kvar och vektorplatsen inte inehåller null
            figvekt [i].rita();

            System.out.println(figvekt[i]);//Figurer toString anropas automatiskt.
        }
    }
}

/*
        Kvadrat figur1 = new Kvadrat(300, 5, 300, 4, 790);
        Cirkel figur2 = new Cirkel(300, 200, 50, 40);
        Linje figur3 = new Linje(300, 399, 5, 10);

        printFigur(figur1);
        printFigur(figur2);
        printFigur(figur3);


    }

    public static void printFigur(Figurer figur) {

        System.out.println(figur.toString());

    }

}

 */
