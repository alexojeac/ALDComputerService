package model.computers;

public class Laptop extends Computer{
    private int batteryLife; //Useful life in days

    public Laptop() {
        super();
        this.batteryLife = 0;
    }
    
    public Laptop(String serialNumber, String brand, String model, int baterryLife) {
        super(serialNumber, brand, model);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
    
    
    
}
