package model.computers;

public class SingleBoard extends Computer{
    private int inches;

    public SingleBoard() {
        super();
        this.inches = 0;
    }
    
    public SingleBoard(String serialNumber, String brand, String model, int inches) {
        super(serialNumber, brand, model);
        this.inches = inches;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }
    
}
