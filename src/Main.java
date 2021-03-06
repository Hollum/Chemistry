import java.io.*;
import java.util.HashMap;

public class Main {

    public static HashMap getAtoms(){
        HashMap<String,Atom> atoms = null;
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


                atom = new Atom(out[0].toLowerCase().trim(), out[1], Double.parseDouble(out[2]),
                        Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                        out[5], out[6], out[7]);
                atoms.put(atom.getName(),atom);

            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return atoms;
    }

    public static HashMap getAtomRadii(){
        HashMap<String,AtomRadii> atoms = null;
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
                atoms.put(atom.getName(),atom);

            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        return atoms;
    }

    public static double calculateDensity(double weight, double radius){
        double density = -1;
        double u = 1.66053906660 * Math.pow(10,-24.0); //atom weight in gram

        if(weight == -1 || radius == -1){
            return density;
        } else {
            radius = radius * Math.pow(10,-10); //Radius is given in pm (picometers), change radius to cm
            density = ((weight * u) * 3) / (4 * Math.PI * Math.pow(radius, 3));
        }
        return density;
    }

    public static void main(String[] args) {

        HashMap<String, Atom> atoms = getAtoms();
        HashMap<String, AtomRadii> atomRadii = getAtomRadii();

        try {
            File file = new File("src/atomicWeight");
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);



            String line;
            String[] out;

            while ((line = br.readLine()) != null) {

                out = line.split(",");

                atoms.get(out[1].toLowerCase().trim()).setWeight(Double.parseDouble(out[3]));
            }

            in.close();
            br.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("\n--- Calculated Radius ----" );
        System.out.println("Atom  " + "  Density" );
        atoms.forEach((key, value) -> {
            double density;
            if(atomRadii.get(value.getName()) != null){
                density = calculateDensity(value.getWeight(), atomRadii.get(value.getName()).getCalculated());
                if(density != -1){
                    System.out.println(value.getName() + " " + density + " g/cm^3");
                } else {
                    System.out.println(value.getName() + " Unknown" );
                }
            }
        });


        System.out.println("\n--- Empirical Radius ----" );
        System.out.println("Atom  " + "  Density" );
        atoms.forEach((key, value) -> {
            double density;
            if(atomRadii.get(value.getName()) != null){
                density = calculateDensity(value.getWeight(), atomRadii.get(value.getName()).getEmpirical());
                if(density != -1){
                    System.out.println(value.getName() + " " + density + " g/cm^3");
                } else {
                    System.out.println(value.getName() + " Unknown" );
                }
            }
        });


        double avogadros = 6.022 * Math.pow(10, 23); //Avogadros number
        System.out.println("\nTask 2 with calculated density" );
        atoms.forEach((key, value) -> {
            double density;
            if(atomRadii.get(value.getName()) != null){
                density = calculateDensity(value.getWeight(), atomRadii.get(value.getName()).getCalculated());
                if(density != -1){
                    System.out.println(
                            value.getName() + " " + ((density / value.getWeight()) * avogadros) * Math.pow(10, -21) + " Zetta-atoms/cm^3"
                    );
                } else {
                    System.out.println(value.getName() + " Unknown" );
                }
            }
        });

        System.out.println("\nTask 2 with density from table" );
        atoms.forEach((key, value) -> {
            System.out.println(
                    value.getName() + " " + ((value.getDensity() / value.getWeight()) * avogadros) * Math.pow(10, -21) + " Zetta-atoms/cm^3"
            );
        });
    }
}
