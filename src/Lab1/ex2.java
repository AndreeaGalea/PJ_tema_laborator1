package Lab1;
import java.io.File;
import java.io.*;

public class ex2 {
    public static void main(String[] args ) throws IOException {
        String nume_fis= "in.txt ";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(nume_fis)));
        int s=0;
        int m=0;
        int minimul=0;
        int maximul=0;
        int nr_val=0;
        for(String linie;(linie=flux_in.readLine())!=null;)
        { s=s+Integer.parseInt(linie);
            nr_val=nr_val+1;
            if(nr_val==1)
            {minimul=Integer.parseInt(linie);
                maximul=Integer.parseInt(linie);}
            else {


                if(Integer.parseInt(linie)<minimul)
                    minimul=Integer.parseInt(linie);
                if(Integer.parseInt(linie)>maximul)
                    maximul=Integer.parseInt(linie);}

        }

        PrintStream flux_out=new PrintStream("out.txt");
        flux_out.println("suma="+s);
        flux_out.println("minimul="+minimul);
        flux_out.println("maximul="+maximul);
        flux_out.println("media="+s/nr_val);
    }
}