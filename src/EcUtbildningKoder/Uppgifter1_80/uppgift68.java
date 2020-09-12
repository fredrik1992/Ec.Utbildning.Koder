package EcUtbildningKoder.Uppgifter1_80;

public class uppgift68 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int index = 0;
        int num = 0;

        while (index < 5) {
            numbers[index] *= 2;
            index++;
        }

        index = 0;

        while (index < 5) {


            System.out.print(numbers[index]);
            index++;
        }
    }
}
