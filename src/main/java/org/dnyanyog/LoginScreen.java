package org.dnyanyog;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginScreen extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Open Login Information Window
        Stage loginStage = new Stage();
        Parent loginRoot = FXMLLoader.load(getClass().getResource("/Login Information.fxml"));
        loginStage.setTitle("Login Information");
        loginStage.setScene(new Scene(loginRoot, 600, 400));
        loginStage.show();

        // Open Add User Window
        Stage addUserStage = new Stage();
        Parent addUserRoot = FXMLLoader.load(getClass().getResource("/AddUser.fxml"));
        addUserStage.setTitle("Add User");
        addUserStage.setScene(new Scene(addUserRoot, 600, 400));
        addUserStage.show();

        // Open Add Product Window
        Stage addProductStage = new Stage();
        Parent addProductRoot = FXMLLoader.load(getClass().getResource("/AddProduct.fxml"));
        addProductStage.setTitle("Add Product");
        addProductStage.setScene(new Scene(addProductRoot, 600, 400));
        addProductStage.show();
    }
}
