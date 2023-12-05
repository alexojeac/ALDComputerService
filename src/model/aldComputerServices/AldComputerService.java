package model.aldComputerServices;

import java.util.HashMap;
import model.computers.Computer;

public class AldComputerService implements IAldComputerService {

    private String name;
    private String address;
    private String telephoneNumber;
    private int employees;
    private HashMap<String, Computer> computers;

    public AldComputerService() {
        this.name = "";
        this.address = "";
        this.telephoneNumber = "";
        this.employees = 0;
        this.computers = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String adress) {
        this.address = adress;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employes) {
        this.employees = employes;
    }

    public HashMap<String, Computer> getComputers() {
        return computers;
    }

    public void setComputers(HashMap<String, Computer> computers) {
        this.computers = computers;
    }

    public void addComputer(Computer computer) {
        this.computers.put(computer.getSerialNumber(), computer);
    }

    public boolean isComputer(String serialNumber) {
        return this.computers.containsKey(serialNumber);
    }

    public Computer getComputer(String serialNumber) {
        return this.computers.get(serialNumber);
    }

    public void removeComputer(String serialNumber) {
        this.computers.remove(serialNumber);
    }

}
