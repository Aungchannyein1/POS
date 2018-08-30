package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader=new FXMLLoader(getClass().getResource("sample.fxml"));
        AnchorPane pane=loader.load();
        primaryStage.initStyle(StageStyle.UNDECORATED);
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
