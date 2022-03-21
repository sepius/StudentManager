package loose.oose.fis.lab.student.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
        primaryStage.setTitle("FIS - Student Manager");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
        Stage secondaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("fxml/view-students.fxml"));
        secondaryStage.setTitle("Student Manager");
        secondaryStage.setScene(new Scene(root, 600, 400));
        secondaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}