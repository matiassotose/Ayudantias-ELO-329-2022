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
      Scene scene = new Scene(pane, 300,300);
      scene.setOnKeyPressed((KeyEvent e) -> {
         handleKey(e, car);
      });
      primaryStage.setScene(scene);
      primaryStage.show();
   }
   private void handleKey(KeyEvent e, Car car){
      switch (e.getCode()) {
         case I: car.move(); break;
         case J: car.turnLeft(); break;
         case K: car.turnRight(); break;
         case E: System.exit(0); break;
      }
   }}