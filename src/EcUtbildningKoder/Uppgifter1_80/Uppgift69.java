package EcUtbildningKoder.Uppgifter1_80;

public class Uppgift69 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int index = 0;

        while (index < 6) {
            numbers[index] += 2;
            index = index + 2;
        }
        index = 0;

        while (index < 6) {
            System.out.println(numbers[index]);
            index++;
        }
    }
}
