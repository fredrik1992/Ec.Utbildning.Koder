package EcUtbildningKoder.Bilregister;

public class main {
    public static void main(String[] args) {
        // Person person = new Person("fredrik","1992");
        //  System.out.println(person);
        // Fordon fordon = new Fordon("Audi",0254,000325);
        // System.out.println(fordon);
        //  Mc mc = new Mc("bike",020,00023,50);
        // System.out.println(mc);
        // Fordonsinnehavare fordonsinnehavare= new Fordonsinnehavare("fredrik","1992");
        //  fordonsinnehavare.addCar("Audi",20,120);
        // System.out.println(fordonsinnehavare.getNumOfCars());

        Fordonsinnehavare owner = new Fordonsinnehavare("Fredrik Granath", "199207220055");

        owner.addCar(new Mc("mbw", 123244434, 123, 125));
        owner.addCar(new Bil("Fiat", 123244434, 978, 7));
        owner.addCar(new Bil("Kia", 45678952, 457, 5));

        System.out.printf("\n \n");
        owner.printList();
        owner.removeFirstCar();

        System.out.printf("\n \n");
        owner.printList();

        owner.removeCarWithRegNummer();

        System.out.printf("\n \n");
        owner.printList();

    }
}
