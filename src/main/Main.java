package main;

import controller.FrontControllerJFrame;
import java.net.MalformedURLException;
import javax.help.HelpSetException;
import model.aldComputerServices.AldComputerService;
import view.MainJFrame;

public class Main {
    public static void main(String[] args) throws MalformedURLException, HelpSetException {
        MainJFrame mainview = new MainJFrame();
        AldComputerService aldcs = new AldComputerService();
        FrontControllerJFrame fc = new FrontControllerJFrame(mainview, aldcs);
        mainview.setVisible(true);    
    }
}
