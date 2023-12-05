package model.computers;

public abstract class Computer {
    private String serialNumber;
    private String brand;
    private String model;

    public Computer() {
        this.serialNumber = "";
        this.brand = "";
        this.model = "";
    }
    
    public Computer(String serialNumber, String brand, String model) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
     
    
}
