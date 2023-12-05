package model.computers;

public class ComputerDesktop extends Computer{
    private String formFactor;

    public ComputerDesktop() {
        super();
        this.formFactor = "";
    }
    
    public ComputerDesktop(String serialNumber, String brand, String model, String formFactor) {
        super(serialNumber, brand, model);
        this.formFactor = formFactor;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

   
    
}
