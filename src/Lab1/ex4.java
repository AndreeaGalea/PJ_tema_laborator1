package Lab1;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(31);
        int rand_int2 = rand.nextInt(31);
        System.out.println("Prima valoare: "+rand_int1);
        System.out.println("A doua valoare: "+rand_int2);
        int contor;
        int cmmdc=0;
        for(contor=1;contor<=30;contor++)
            if(rand_int1%contor==0 && rand_int2%contor==0)
                cmmdc=contor;
        System.out.println("cmmdc: "+cmmdc);
    }
}