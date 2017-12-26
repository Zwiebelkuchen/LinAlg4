package sample;

import com.sun.source.tree.ParenthesizedTree;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.PointLight;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.DrawMode;
import javafx.scene.shape.Mesh;
import javafx.scene.shape.MeshView;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        MeshView root1 = FXMLLoader.load(getClass().getResource(Views.window.getFileName()));
        //AnchorPane root = new AnchorPane(root1);
//        Group root = new Group();
//        root1.setVisible(true);

        final Group root = new Group(root1);

        primaryStage.setTitle("LinAlg4");
        primaryStage.setScene(new Scene(root, 1000, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
