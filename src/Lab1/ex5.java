package Lab1;
import java.util.Random;
public class ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int numar = rand.nextInt(21);
        //0, 1, 1, 2, 3, 5, 8, 13,
        System.out.println(numar);
        int a=0;
        int b=1;
        int c=0;
        while(a+b<=numar)
        {c=a+b;
            a=b;
            b=c;

        }
        if (c==numar)
            System.out.println("da");
        else
            System.out.println("nu");



    }
}
