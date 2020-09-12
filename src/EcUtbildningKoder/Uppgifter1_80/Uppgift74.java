package EcUtbildningKoder.Uppgifter1_80;

public class Uppgift74 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, -3, 4, 5, 5, 7};
        int index = 0;
        int biggestNum = numbers[0];
        int smallestNum = numbers[0];


        while (index < 7) {

            if(numbers[index] >biggestNum){
                biggestNum = numbers[index];


            }
            if (numbers[index]<smallestNum){
                smallestNum =numbers[index];
            }
            index++;

        }
        System.out.printf("biggest number is :%d and smallest:%d",biggestNum,smallestNum);
    }
}
