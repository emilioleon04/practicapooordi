public abstract class Computer{
    private String manufacturer;
    private String model;
    private String opertingSystem;
    
    public Computer(String manufacturer, String model, String operatingSystem) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.opertingSystem = operatingSystem;
    }

    public abstract String getComputerType();

    public abstract int calculatePortabilityScore();


    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOpertingSystem() {
        return opertingSystem;
    }

    public void setOpertingSystem(String opertingSystem) {
        this.opertingSystem = opertingSystem;
    }

    public String toString() {
        return  model + " " + manufacturer + " " + opertingSystem + " " + getComputerType();
    }

    
}