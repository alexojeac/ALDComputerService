package model.computers;

import java.util.ArrayList;
import model.aldComputerServices.services.Service;

public abstract class Computer {

    private String serialNumber;
    private String brand;
    private String model;
    private ArrayList<Service> services;

    public Computer() {
        this.serialNumber = "";
        this.brand = "";
        this.model = "";
        this.services = new ArrayList<>();
    }

    public Computer(String serialNumber, String brand, String model, ArrayList<Service> services) {
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.model = model;
        this.services = services;
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

    public ArrayList<Service> getServices() {
        return services;
    }

    public void setServices(ArrayList<Service> services) {
        this.services = services;
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public void removeService(int position) {
        this.services.remove(position);
    }

}
