package controller.reports;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import view.reports.IncomeReportDialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class IncomeReportController {

    private final IncomeReportDialog view;
    private Connection connection;
    private final String currentDirectory = System.getProperty("user.dir");
    private final String ip = "192.168.250.46",
            databaseName = "aldComputerService",
            port = "3306",
            user = "user",
            password = "abc123.";

    public IncomeReportController(IncomeReportDialog view) {
        this.view = view;
        this.view.addGenerateReportListener(this.getGenerateReportActionListener());
        setData();
    }

    private ActionListener getGenerateReportActionListener() {
        ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Files.createDirectories(Paths.get(currentDirectory + "/Reports"));
                    JFileChooser fileChooser = new JFileChooser(currentDirectory + "/Reports");
                    fileChooser.setSelectedFile(new File("Report_5_5.pdf"));
                    int returnValue = fileChooser.showSaveDialog(view);

                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        File file = fileChooser.getSelectedFile();
                        setConnection(file.getAbsolutePath());
                    }
                } catch (IOException ex) {
                    Logger.getLogger(IncomeReportController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        return al;
    }

    private void setConnection(String fileName) {
        Properties props = new Properties();
        props.setProperty("user", view.getUser());
        props.setProperty("password", view.getPass());

        try {
            String url = "jdbc:mariadb://" + view.getIp() + ":" + view.getPort() + "/" + view.getDatabaseName();
            connection = DriverManager.getConnection(url, props);

            generateReport(fileName);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(IncomeReportController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void generateReport(String file) {
        try {
            JasperReport report = JasperCompileManager.compileReport(IncomeReportController.class.getClassLoader().getResourceAsStream("jasperReports/report_5_4.jrxml"));
            JasperPrint print = JasperFillManager.fillReport(report, null, connection);
            JasperExportManager.exportReportToPdfFile(print, file);
            JasperViewer.viewReport(print, false);
        } catch (JRException ex) {
            Logger.getLogger(IncomeReportController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void setData() {
        view.setIp(ip);
        view.setPort(port);
        view.setDatabaseName(databaseName);
        view.setUser(user);
        view.setPass(password);
    }
}
