package lk.ijse.BlueOcean.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class IncomeReportsController {
    public void btnRoomsOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../View/ManageRoomForm.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void btnMealsOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../View/ManageMealForm.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void logOutOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../View/MainForm.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../View/AdminDashboard.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void MonthlyReport(ActionEvent actionEvent) {
    }

    public void Annualeport(ActionEvent actionEvent) {
    }
}
