import java.io.*;
import java.util.HashMap;

public class Main {

    public static HashMap getAtoms(){
        HashMap<String, Atom> atoms = null;
        try {
            atoms = new HashMap<>();
            File file = new File("src/numericDensities");
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);



            String line;
            String[] out;

            while ((line = br.readLine()) != null) {

                Atom atom;
                out = line.split(",");


                atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                        Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                        out[5], out[6], out[7]);
                atoms.put(out[0], atom);

            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(atoms);
        return atoms;
    }

    public static HashMap getAtomRadii(){
        HashMap<String, AtomRadii> atoms = null;
        try {
            atoms = new HashMap<>();
            File file = new File("src/atomicRadii");
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);



            String line;
            String[] out;

            while ((line = br.readLine()) != null) {

                AtomRadii atom;
                out = line.split(",");



                atom = new AtomRadii(Double.parseDouble(out[0]), out[1], out[2],
                        Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                        Double.parseDouble(out[5]), Double.parseDouble(out[6]),
                        Double.parseDouble(out[7]), Double.parseDouble(out[8]));
                atoms.put(out[2], atom);

            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(atoms);
        return atoms;
    }


    public static void main(String[] args) {
        getAtoms();
        getAtomRadii();
    }

}
