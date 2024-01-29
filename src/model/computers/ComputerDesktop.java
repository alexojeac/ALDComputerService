package model.computers;

import java.util.ArrayList;
import model.services.Service;

public class ComputerDesktop extends Computer {

    private String formFactor;

    public ComputerDesktop() {
        super();
        this.formFactor = "";
    }

    public ComputerDesktop(String serialNumber, String brand, String model, String formFactor, ArrayList<Service> services) {
        super(serialNumber, brand, model, services);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

}
