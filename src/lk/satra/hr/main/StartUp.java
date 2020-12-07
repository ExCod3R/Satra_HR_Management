/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.satra.hr.main;

/**
 *
 * @author Jayani
 */
public class StartUp extends Application{

    public static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
        Parent parent = FXMLLoader.load(this.getClass()
                .getResource("/lk/"));
        Scene scene = new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle(" - Login");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

