public class Laptop extends Computer implements PortableDevice{
    private double caseHeight;
    private double weight;

    public Laptop(String manufacturer, String model, String opertingSystem, double caseHeight, double weight){
        super(manufacturer, model, opertingSystem);
        this.caseHeight = caseHeight;
        this.weight = weight;
    }


    @Override
    public int getBatteryCapacity() {
        return 100;
    }

    @Override
    public String getComputerType() {
        return "Computadora Portatil";
    }

    @Override
    public int calculatePortabilityScore() {
        int lap = (int) (5 + caseHeight/20);
        return lap;
    }



    public double getCaseHeight() {
        return caseHeight;
    }



    public void setCaseHeight(double caseHeight) {
        this.caseHeight = caseHeight;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }

    
    
}
