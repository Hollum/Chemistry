import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static ArrayList getAtoms(){
        ArrayList<Atom> atoms = null;
        try {
            atoms = new ArrayList<>();
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
                atoms.add(atom);

            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return atoms;
    }

    public static ArrayList getAtomRadii(){
        ArrayList<AtomRadii> atoms = null;
        try {
            atoms = new ArrayList<>();
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
                atoms.add(atom);

            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return atoms;
    }

    public static double calculateDensity(double mass, double radius){ //radius is 10^-12
        double density = -1;
        if(mass == -1 || radius == -1){
            return density;
        } else {
            double u = 1.66053906660 * Math.pow(10,-24.0); //
            density = (mass * u * 3) / (4 * Math.PI * Math.pow(radius * (Math.pow(10,-12)), 3));
        }
        return density;
    }

    public static void main(String[] args) {
        //getAtoms();
        getAtomRadii();

        ArrayList<Atom> atoms = getAtoms();
        ArrayList<AtomRadii> atomRadii = getAtomRadii();

        try {
            File file = new File("src/atomicWeight");
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);



            String line;
            String[] out;
            int counter = 0;

            while ((line = br.readLine()) != null) {

                AtomRadii atom;
                out = line.split(",");

                atoms.get(counter).setWeight(Double.parseDouble(out[3]));
                counter++;
            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    /*
        for (AtomRadii item: atomRadii){
            System.out.println(item.toString());
        }

        for (Atom item: atoms){
            System.out.println(item.toString());
        }
     */



    /*
        //Get all weights based on empirical radius
        for(int i = 0; i < atoms.size(); i++){ //atoms and atomRadii contains the same length because of same periodic table
            System.out.println(
                    atoms.get(i).getName() + ": " + calculateDensity(atoms.get(i).getWeight(), atomRadii.get(i).getEmpirical())
            );
        }
     */

        //Get all weights based on calculated radius
        for(int i = 0; i < atoms.size(); i++){ //atoms and atomRadii contains the same length because of same periodic table
            System.out.println(
                    atoms.get(i).getName() + ": " + calculateDensity(atoms.get(i).getWeight(), atomRadii.get(i).getCalculated())
            );
        }

    }

}
