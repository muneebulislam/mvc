package com.example.mvc;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;

import java.util.List;

public class BoxView extends StackPane implements Subscriber {
    Canvas myCanvas;
    GraphicsContext gc;

    public BoxView() {
        myCanvas = new Canvas(800, 800);
        gc = myCanvas.getGraphicsContext2D();
        this.getChildren().add(myCanvas);
    }

    public void setupEvents(AppController controller) {
        this.setOnMousePressed(controller::handleMousePressed);
        this.setOnMouseDragged(controller::handleMouseDragged);
        this.setOnMouseReleased(controller::handleMouseReleased);
    }

    public void draw(List<Box> boxes) {
        gc.clearRect(0, 0, myCanvas.getWidth(), myCanvas.getHeight());
        gc.setFill(Color.INDIGO);
        boxes.forEach(entity -> {
            gc.fillRect(entity.getX() - 10, entity.getY() - 10, 20, 20);
        });
    }

    @Override
    public void modelChanged(List<Box> boxes) {
        // whenever the model changed, re-draw the canvas
        draw(boxes);
    }
}
