package ba.unsa.etf.rs.tutorijal2;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class Controller {
    public Label prezimeLabela;

    public void onClick(ActionEvent actionEvent) {
        System.out.println("Button is pressed!");
        prezimeLabela.setText(prezimeLabela.getText()+prezimeLabela.getText());

    }
}
