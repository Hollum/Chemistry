public class AtomRadii {
    private double atomicNumber;
    private String symbol;
    private String name;
    private double empirical;
    private double calculated;
    private double vanDeraWals;
    private double singleond; //Covalent
    private double tripleond; //Covalent
    private double metallic;

    //atomic number,symbol,name,empirical †,Calculated,van der Waals,Covalent (singleond),Covalent (tripleond),Metallic


    public AtomRadii(double atomicNumber, String symbol, String name, double empirical, double calculated, double vanDeraWals, double singleond, double tripleond, double metallic) {
        this.atomicNumber = atomicNumber;
        this.symbol = symbol;
        this.name = name;
        this.empirical = empirical;
        this.calculated = calculated;
        this.vanDeraWals = vanDeraWals;
        this.singleond = singleond;
        this.tripleond = tripleond;
        this.metallic = metallic;
    }

    public AtomRadii() {

    }

    @Override
    public String toString() {
        return "AtomRadii{" +
                "atomicNumber=" + atomicNumber +
                ", symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", empirical=" + empirical +
                ", calculated=" + calculated +
                ", vanDeraWals=" + vanDeraWals +
                ", singleond=" + singleond +
                ", tripleond=" + tripleond +
                ", metallic=" + metallic +
                '}';
    }
}
