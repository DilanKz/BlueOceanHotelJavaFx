package lk.ijse.BlueOcean.Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class OrderMealController implements Initializable {
    public Label lblDate;
    public ComboBox cmbMealType;

    public void btnBackOnAction(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("../View/ReserveRoom.fxml"));
        Scene scene =new Scene(root);
        Stage window=(Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public void btnPrintOnAction(ActionEvent actionEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String now = String.valueOf(LocalDate.now());
        lblDate.setText(now);
        addMealType();
    }

    private void addMealType(){
        cmbMealType.getItems().addAll(
          "Local",
                "Chinese",
                "French"
        );
    }
}
