public class AtomRadii {
    private double atomicNumber;
    private String symbol;
    private String name;
    private double empirical; //radius
    private double calculated; //radius
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

    public double getAtomicNumber() {
        return atomicNumber;
    }

    public void setAtomicNumber(double atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEmpirical() {
        return empirical;
    }

    public void setEmpirical(double empirical) {
        this.empirical = empirical;
    }

    public double getCalculated() {
        return calculated;
    }

    public void setCalculated(double calculated) {
        this.calculated = calculated;
    }

    public double getVanDeraWals() {
        return vanDeraWals;
    }

    public void setVanDeraWals(double vanDeraWals) {
        this.vanDeraWals = vanDeraWals;
    }

    public double getSingleond() {
        return singleond;
    }

    public void setSingleond(double singleond) {
        this.singleond = singleond;
    }

    public double getTripleond() {
        return tripleond;
    }

    public void setTripleond(double tripleond) {
        this.tripleond = tripleond;
    }

    public double getMetallic() {
        return metallic;
    }

    public void setMetallic(double metallic) {
        this.metallic = metallic;
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
