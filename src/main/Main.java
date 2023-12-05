package main;

import controller.FrontControllerJFrame;
import model.aldComputerServices.AldComputerService;
import view.MainJFrame;

public class Main {
    public static void main(String[] args) {
        MainJFrame mainview = new MainJFrame();
        AldComputerService aldcs = new AldComputerService();
        FrontControllerJFrame fc = new FrontControllerJFrame(mainview, aldcs);
        mainview.setVisible(true);    
    }
}
