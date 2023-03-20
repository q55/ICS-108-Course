package com.example.javafxx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class lab17 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        //Button btn = new Button("Create an image");
        StackPane pane = new StackPane();
        //pane.getChildren().add(btn);


        pane.setPadding(new Insets(10,10,10,10));
        String[] images = {"img_1.png","img.png","img_2.png"};
        String img= images[(int) (3 *Math.random())];
        System.out.println(img);
        Image image = new Image(img);
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(470);
        imageView.setFitWidth(700);
        pane.getChildren().add(imageView);
        Scene scene = new Scene(pane,730,450);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("RandomCreatingImg");
    }
}
