package EcUtbildningKoder.Uppgifter1_80;

public class Uppgift70 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, -2, 7};
        int index = 0;
        int positiveNumber = 0;

        while (index < 6) {
            if (numbers[index] > 0) {
                positiveNumber ++;

            }
            index++;
        }
        System.out.printf("the number of postive numbers are [%d]",positiveNumber);


    }
}
