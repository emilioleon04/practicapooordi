public class Desktop extends Computer{

    public Desktop(String manufacturer, String model, String opertingSystem){
        super(manufacturer, model, opertingSystem);
    }
    
    @Override
    public String getComputerType() {
        return "Computadora de Escritorio";
    }

    @Override
    public int calculatePortabilityScore() {
        return 0;
    }

    
}