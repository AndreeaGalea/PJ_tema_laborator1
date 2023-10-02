package Lab1;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Lungime=");
        int lungime = scanner.nextInt();
        System.out.println("Latime=");
        int latime = scanner.nextInt();
        int parametru=2*(lungime+latime);
        int aria=lungime*latime;
        System.out.println("Parametru:"+parametru);
        System.out.println("Aria:"+aria);
        scanner.close();
    }

}