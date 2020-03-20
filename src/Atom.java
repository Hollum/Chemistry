public class Atom {
    private String name;
    private String symbol;
    private double density;
    private double numberOfAtoms;
    private double atomicNumber;
    private String description;
    private String color;
    private String notes;

    public Atom(String name, String symbol, double density, double numberOfAtoms, double atomicNumber, String description, String color, String notes){
        this.name = name;
        this.symbol = symbol;
        this.density = density;
        this.numberOfAtoms = numberOfAtoms;
        this.atomicNumber = atomicNumber;
        this.description = description;
        this.color = color;
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "Atom{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", density=" + density +
                ", numberOfAtoms=" + numberOfAtoms +
                ", atomicNumber=" + atomicNumber +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
