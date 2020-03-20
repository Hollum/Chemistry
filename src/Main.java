import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
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
                System.out.println(out.length);

                switch (out.length){
                    case 1:
                        atom = new Atom(out[0], "", -1,
                                -1, -1,
                                "", "", "");
                        atoms.put(out[0], atom);
                        break;
                    case 2:
                        atom = new Atom(out[0], out[1], -1,
                                -1, -1,
                                "", "", "");
                        atoms.put(out[0], atom);
                        break;
                    case 3:
                        atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                                -1, -1,
                                "", "", "");
                        atoms.put(out[0], atom);
                        break;
                    case 4:
                        atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                                Double.parseDouble(out[3]), -1,
                                "", "", "");
                        atoms.put(out[0], atom);
                        break;
                    case 5:
                        atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                                Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                                "", "", "");
                        atoms.put(out[0], atom);
                        break;
                    case 6:
                        atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                                Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                                out[5], "", "");
                        atoms.put(out[0], atom);
                        break;
                    case 7:
                        atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                                Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                                out[5], out[6], "");
                        atoms.put(out[0], atom);
                        break;
                    case 8:
                        atom = new Atom(out[0], out[1], Double.parseDouble(out[2]),
                                Double.parseDouble(out[3]), Double.parseDouble(out[4]),
                                out[5], out[6], out[7]);
                        atoms.put(out[0], atom);
                        break;
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
