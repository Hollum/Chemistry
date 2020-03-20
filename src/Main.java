import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void test(){

    }

    public static void main(String[] args) {
        HashMap<String, Atom> atoms = new HashMap<String, Atom>();
        try {
            File file = new File("src/numericDensities");
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);



            String line;
            String[] out;

            while ((line = br.readLine()) != null) {

                Atom atom;
                out = line.split(",");


                if(out[2].equals("Unknown") && out[3].equals("Unknown") && out[4].equals("Unknown")){
                    atom = new Atom(out[0], out[1], -1,
                            -1, -1,
                            out[5], out[6], out[7]);
                    atoms.put(out[0], atom);
                } else if(out[2].equals("Unknown") && out[3].equals("Unknown")){
                    atom = new Atom(out[0], out[1], -1,
                            -1, Double.parseDouble(out[4]),
                            out[5], out[6], out[7]);
                    atoms.put(out[0], atom);
                } else {
                    atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                            Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                            out[5], out[6], out[7]);
                    atoms.put(out[0], atom);
                }

            }

            in.close();
            br.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(atoms);
    }

}
