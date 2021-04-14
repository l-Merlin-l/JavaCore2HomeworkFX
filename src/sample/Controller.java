package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextArea Messages;
    @FXML
    private TextField Message;

    public void clickBtn1(ActionEvent actionEvent) {
        if (!Message.getText().equals("")) {
            Messages.appendText("Вы пишите:\n" + Message.getText() + "\n");
            Message.clear();
            Message.requestFocus();
        }
    }
}
