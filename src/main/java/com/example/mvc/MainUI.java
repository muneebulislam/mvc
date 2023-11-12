package com.example.mvc;

import javafx.scene.layout.StackPane;

public class MainUI extends StackPane {
    AppController controller = new AppController();
    BoxView boxView = new BoxView();
    BoxModel model = new BoxModel();
    InteractionModel iModel = new InteractionModel();

    // link MVC together
        boxView.setupEvents(controller);
        controller.setModel(model);
        controller.setIModel(iModel);
        model.addSubscriber(boxView);
        this.getChildren().add(boxView);
}
}
