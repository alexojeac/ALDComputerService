package model.computers;

import java.util.ArrayList;
import model.aldComputerServices.services.Service;

public class Laptop extends Computer {

    private int batteryLife; //Useful life in days

    public Laptop() {
        super();
        this.batteryLife = 0;
    }

    public Laptop(String serialNumber, String brand, String model, int baterryLife, ArrayList<Service> services) {
        super(serialNumber, brand, model, services);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

}
