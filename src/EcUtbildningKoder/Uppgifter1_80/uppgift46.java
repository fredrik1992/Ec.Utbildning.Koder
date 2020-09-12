package EcUtbildningKoder.Uppgifter1_80;

public class uppgift46 {
    public static void main(String[] args) {
        int salary = 1;
        int total = 1;
        int days = 1;

        while (total < 1000000) {

            salary = salary * 2;
            total = salary / 100;
            days = days + 1;
        }
        System.out.println(days);
    }
}
