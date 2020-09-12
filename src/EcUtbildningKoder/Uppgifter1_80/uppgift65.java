package EcUtbildningKoder.Uppgifter1_80;

import java.util.Scanner;

public class uppgift65 {
    public static void main(String[] args) {

        int num, num2,higestNum,nextHighNum,difference;

        int count = 1;




        Scanner scan = new Scanner(System.in);
        System.out.println("write the first number");
        num = scan.nextInt();
        higestNum =num;
        nextHighNum =num;

        while (count<3){
            num2 =scan.nextInt();

            if (num2 > higestNum){
                nextHighNum = higestNum;
                higestNum =num2;
            }
            if (num2 > nextHighNum && num2 !=higestNum){
                nextHighNum = num2;
            }
            count++;

        }
        difference = higestNum -nextHighNum;
        System.out.printf("de difference between [%d] and [%d] is [%d]",higestNum,nextHighNum,difference);

        }

    }
