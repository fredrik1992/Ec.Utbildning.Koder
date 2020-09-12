package EcUtbildningKoder.Uppgifter1_80;

public class uppgift47 {
    public static void main (String[] args){
        int produkt=1;
        int numbers =1;

        while (numbers<=15){
            if (numbers%2 !=0){
                produkt=produkt*numbers;
                numbers=numbers+2;
            }

            }
        System.out.println(produkt);
        }
}
