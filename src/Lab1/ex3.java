package Lab1;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dati un numar:");
        int numar = scanner.nextInt();
        int contor;
        int numar_divizori=0;
        for(contor=2;contor <numar/2;contor++)
            if(numar%contor==0)
        {numar_divizori=numar_divizori+1;
            System.out.println(contor);}
        if(numar_divizori==0)
            System.out.println("Numarul dat este prim");
    }
}