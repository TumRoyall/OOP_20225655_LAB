package hust.soict.globalict.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private Pane drawingAreaPane;

    @FXML
    private ToggleGroup toolGroup;

    @FXML
    void clearButtonPressed(ActionEvent event) throws Exception {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    private void drawingAreaMouseDragged(MouseEvent event) {
        String selectedTool = ((RadioButton) toolGroup.getSelectedToggle()).getText();
        Color color;

        if ("Pen".equals(selectedTool)) {
            color = Color.BLACK; // Màu bút vẽ
        } else if ("Eraser".equals(selectedTool)) {
            color = Color.WHITE; // Màu tẩy (màu nền)
        } else {
            return; // Không chọn công cụ nào
        }

        Circle newCircle = new Circle(event.getX(), event.getY(), 4, color);
        drawingAreaPane.getChildren().add(newCircle);
    }
}
