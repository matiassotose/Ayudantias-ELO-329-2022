import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.input.KeyEvent;

public class GraphicDrivenCar extends Application {
   public void start(Stage primaryStage) {
      Car car = new Car(100, 150);
      Pane pane = new Pane();
      pane.getChildren().add(car.getView());
      Scene scene = new Scene(pane, 400,300);
      primaryStage.setScene(scene);
      primaryStage.show();
      //?????
   }
   // ????
}