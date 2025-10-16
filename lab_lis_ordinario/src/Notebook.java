public final class Notebook extends Laptop    {

    public Notebook(String manufacturer, String model, String opertingSystem, double caseHeight, double weight) {
        super(manufacturer, model, opertingSystem, caseHeight, weight);
        
    }

    @Override
    public int calculatePortabilityScore() {
        return 1;
    }

    @Override
    public String getComputerType() {
        return "Computadora-laptop: NOTEBOOK";
    }

    
    
    
}
