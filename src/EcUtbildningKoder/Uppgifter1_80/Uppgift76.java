package EcUtbildningKoder.Uppgifter1_80;

public class Uppgift76 {
    public static void main(String[] args) {

        int[] numbers = {0, 2, -3, 4, -5, 5, 7};
        int[] number2 = new int[7];
        int indexForNum1 = 6;
        int indexForNum2 = 0;


        while (indexForNum1 > 0) {
            number2[indexForNum2] = numbers[indexForNum1];
            indexForNum1--;
            indexForNum2++;
        }
        indexForNum2 = 0;
        while (indexForNum2 < 7) {
            System.out.printf("%d%n", number2[indexForNum2]);
            indexForNum2++;
        }
    }
}
