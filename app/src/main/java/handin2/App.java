/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package handin2;

import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        String filename = "../app/data/lines20k.txt";
        var model = new Model(filename);
        var view = new View(model, primaryStage);
        var controller = new Controller(model,view);
        
    }
}