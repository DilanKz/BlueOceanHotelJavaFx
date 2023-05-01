package lk.ijse.BlueOcean.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AdminDashboardController implements Initializable {
    public Label lblDate;
    public Label lblAdminName;

    public void btnRoomsOnAction(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("../View/ManageRoomForm.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public void btnMealsOnAction(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("../View/ManageMealForm.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public void btnReportOnAction(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("../View/IncomeReportsForm.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public void logOutOnAction(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("../View/MainForm.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.setResizable(false);
        window.show();
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(getClass().getResource("../View/AdminLogin.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String now = String.valueOf(LocalDate.now());
        lblDate.setText(now);
    }
}
