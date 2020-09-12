package EcUtbildningKoder.Uppgifter1_80;

public class uppgift73 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 5, 7};
        int index = 0;
        int total = 0;
        double median;
        int numCount = 0;


        while (index < 7) {
            total += numbers[index];
            index++;
            numCount++;
        }
        median = (double)total / numCount;
        System.out.printf("The total of all the numbers are:%d and the median:%f", total, median);
    }
}
