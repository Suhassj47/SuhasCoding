import java.util.Random;

public class generateRandomNumberAndStrings {

    public static void main(String args[]) {

        Random rad = new Random();
        int ran_num= rad.nextInt(1000);
        System.out.println(ran_num);

        double ran_dbl = rad.nextDouble();
        System.out.println(ran_dbl);

        System.out.println(Math.random());
        

    }
}
