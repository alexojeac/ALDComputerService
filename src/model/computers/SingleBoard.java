package model.computers;

import java.util.ArrayList;
import model.aldComputerServices.services.Service;

public class SingleBoard extends Computer {

    private int inches;

    public SingleBoard() {
        super();
        this.inches = 0;
    }

    public SingleBoard(String serialNumber, String brand, String model, int inches, ArrayList<Service> services) {
        super(serialNumber, brand, model, services);
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

}
