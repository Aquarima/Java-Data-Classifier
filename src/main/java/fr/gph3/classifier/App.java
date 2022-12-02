package fr.gph3.classifier;

import fr.gph3.classifier.controllers.PanelView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        PanelView app = new PanelView(stage);
        stage.setTitle("Classification");
        stage.setScene(new Scene(app.loadView()));
        stage.show();
    }
}
