package com.example.ejemplofx;

import com.example.ejemplofx.control.ControlUnDado;
import com.example.ejemplofx.modelo.Dado;
import com.example.ejemplofx.ui.PantallaDado;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private ControlUnDado controlUnDado;
    @Override
    public void start(Stage stage) throws IOException {
        // FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        controlUnDado = new ControlUnDado();
        Scene scene = new Scene(createSceneStage(), 320, 240);
        stage.setTitle("Sumar un dado");
        stage.setScene(scene);
        stage.show();
    }

    private PantallaDado createSceneStage() {
        return controlUnDado.getPantalla();
    }


    private HBox createSceneGraph() {
        HBox hBox = new HBox();
        hBox.setPrefSize(600, 600);

        // Add stuff to UI
        Font font = new Font("Arial", 50);
        Dado dado = new Dado();
        Label label = new Label();
        int EMOJI_DADO = 9855;
        String emoji = new String(Character.toChars(EMOJI_DADO + dado.getValor()));
        label.setText(emoji);
        label.setFont(font);
        Button lanzar = new Button("Lanzar");
        lanzar.setOnMouseClicked(event -> {
            dado.lanzar();
            label.setText(new String(Character.toChars(EMOJI_DADO + dado.getValor())));
        });

        // Add elements to UI
        hBox.getChildren().addAll(label, lanzar);
        return hBox;
    }

}


