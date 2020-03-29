public class Atom {
    private String name;
    private String symbol;
    private double density;
    private double numberOfAtoms;
    private double atomicNumber;
    private String description;
    private String color;
    private String notes;

    private double weight;

    //Name,Symbol,Density (g/cm³),number of atoms per volume unit (Zetta-atoms/cm³),Atomic number,Description/Mohs' hardness,Color,Notes

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getNumberOfAtoms() {
        return numberOfAtoms;
    }

    public void setNumberOfAtoms(double numberOfAtoms) {
        this.numberOfAtoms = numberOfAtoms;
    }

    public double getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(double atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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
