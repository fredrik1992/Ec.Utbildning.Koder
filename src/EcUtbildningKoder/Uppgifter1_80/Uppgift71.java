package EcUtbildningKoder.Uppgifter1_80;

public class Uppgift71 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, -2, -2, 7};
        int index = 0;
        int biggerNumbers = 0;
        int biggestNum = numbers[0];

        while (index<7){
            if (numbers[index]> biggestNum){
                biggerNumbers ++;
            }
            index++;
        }
        System.out.println(biggerNumbers);

    }
}
