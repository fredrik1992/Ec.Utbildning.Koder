package EcUtbildningKoder.AnnikasExempel;//Author:Fredrik
//Datum:??
//visar på hur olika format specifiers  (%f %.2f) osv påverkar en utskrift


public class StringFormatExempel {

    public static void main(String[] args) {
        int num1 = 23, num2 = 9734;
        double fTal = 78.5555;

        System.out.println(num1);
        System.out.println(num2);
        System.out.printf("%f", fTal);
        System.out.println("\n");

        System.out.println(num1);
        System.out.println(num2);
        System.out.printf("%.2f", fTal);
        System.out.println("\n");

        System.out.printf("%010x\n", num1);
        System.out.printf("%010x\n", num2);
        System.out.printf("%010f\n", fTal);


    }
}
