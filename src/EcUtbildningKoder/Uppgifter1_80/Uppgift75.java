package EcUtbildningKoder.Uppgifter1_80;

public class Uppgift75 {
    public static void main(String[] args) {

        int[] numbers = {0, 2, -3, 4, -5, 5, 7};
        int index = 0;
        int totalNegative = 0;
        int totalPositive = 0;


        while (index < 7) {
            if (numbers[index] < 0) {
                totalNegative += numbers[index];
            }
            if (numbers[index] > 0) {
                totalPositive += numbers[index];
            }
            index++;
        }
        System.out.printf("total positive is :%d and total negative is :%d", totalPositive, totalNegative);
    }
}
