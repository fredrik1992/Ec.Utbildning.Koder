//Author:Fredrik Granath
//Datum:??
//Denna koden skapar en array med 10 positioner av float tal och räknar ut summan
//av alla doubles  medelvärdet samt medianen


package EcUtbildningKoder.FörstaMetoderna;

import java.util.Arrays;
import java.util.Scanner;

public class FloatTal {


    public static void main (String[] args){
        float [] nums = new float[10];
        numIn(nums);

        print(nums);

        System.out.printf("the total of the vektor is:%f avarage is:%f and median is :%f",total(nums),avarage(nums),median(nums));


    }
    public static void numIn(float[]vekt){
        System.out.printf("give 10 float numbers");
        Scanner scan = new Scanner(System.in);

        for (int i = 0 ; i< vekt.length;i++){


            vekt [i] = scan.nextFloat();
        }
    }
    public static void print(float[] vektor){

        for (int i = 0 ; i< vektor.length;i++){
            System.out.println(vektor[i]);
        }

    }
    public static float total(float[] vektor){
        float total = 0;
        for (int i = 0 ; i< vektor.length;i++){

            total += vektor[i];

        }
        return total;
    }
    public static float avarage(float[] vektor){
        float avarage = 0;

        avarage = total(vektor)/vektor.length;

        return avarage;
    }

    //måste spara de i index position o om flera följer varandra
    public static float median (float[] vektor){
        //1,1,5,6,8,5,
        Arrays.sort(vektor);
        float arrayMid = vektor.length/2;

        if (arrayMid%2 !=0.0){
            arrayMid +=1;
        }
        return arrayMid;






    }

}
