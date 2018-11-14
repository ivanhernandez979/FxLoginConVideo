package paquete_nuevo;


import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class main extends Application {

    Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
      this.stage=primaryStage;
      mainWindow();
    }

    public void mainWindow(){

        FXMLLoader loader=new FXMLLoader(main.class.getResource("Edit.fxml"));
        try {
            AnchorPane pane=loader.load();

            Scene scene=new Scene(pane);
            stage.setScene(scene);
            stage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }




    public static void main(String[] args) {
        launch(args);
    }
}