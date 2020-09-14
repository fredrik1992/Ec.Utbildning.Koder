package EcUtbildningKoder.Bilregister;

import EcUtbildningKoder.Figurer.Cirkel;

import java.util.Scanner;

public class Fordonsinnehavare extends Person {
    // private int numOfCars = 1; // är 0 igentligen men en array
    private Fordon[] fordon = new Fordon[50];


    public Fordonsinnehavare(String namn, String personnumer) { // int numOfCars) {
        super(namn, personnumer);
        //setNumOfCars(numOfCars);
    }

    public void printList() {
        System.out.printf("%s äger: %n", super.toString());
        for (int i = 0; i < fordon.length; i++) {
            if (fordon[i] == null) {
                //skip one run

            } else {
                System.out.print(fordon[i] + "\n");
            }


        }

    }

    //  public void setNumOfCars(int numOfCars) {
    //     this.numOfCars = numOfCars;
    // }

    // public int getNumOfCars() {
    //     return numOfCars;
    //  }


    public void addCar(Fordon fordonn) {


        for (int i = 0; i < fordon.length; i++) {
            if (fordon[i] == null) {

                fordon[i] = fordonn;
                i = fordon.length;

            }
        }
        //if null add then change to I


    }

    public void removeFirstCar() {
        for (int i = 0; i < fordon.length; i++) {
            if (fordon[i] != null && fordon[i + 1] != null) {
                fordon[i] = null;
                i = fordon.length;
            }

        }

    }

    public void removeCarWithRegNummer() {
        Scanner scan = new Scanner(System.in);
        System.out.println("write the regnum of the car to remove");
        int regNumToRemove = scan.nextInt();
        for (int i = 0; i < fordon.length; i++) {
            if (fordon[i] != null && fordon[i].getRegistreringsnummer() == regNumToRemove) {
                fordon[i] = null;
                i = fordon.length;
            }

        }
    }

}
