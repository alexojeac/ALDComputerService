package model.aldComputerServices.services;

import java.util.Date;

public class Service {
    private String description;
    private String obs;
    private Date init_data;
    private Date end_data;
    private String phone;
    private boolean done;
    private double price;

    public Service() {
        this.description = "";
        this.obs = "";
        this.init_data = new Date();
        this.end_data = null;
        this.phone = "";
        this.done = false;
        this.price = 0;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public Date getInit_data() {
        return init_data;
    }

    public void setInit_data(Date init_data) {
        this.init_data = init_data;
    }

    public Date getEnd_data() {
        return end_data;
    }

    public void setEnd_data(Date end_data) {
        this.end_data = end_data;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
    
    
}
