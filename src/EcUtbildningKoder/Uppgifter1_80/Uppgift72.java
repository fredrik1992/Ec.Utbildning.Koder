package EcUtbildningKoder.Uppgifter1_80;

public class Uppgift72 {
    public static void main(String[] args) {

        int[] numbers = {-1, 2, 3, 4, 5, 5, 7};
        int index = 6;


        while (index >= 0) {

            if (numbers[index] <0) {
                System.out.printf("the last negative number is at index:%d and has the value:%d",index,numbers[index]);
                index = -1;
            }
            else{
                index--;
            }
        }


    }
}
