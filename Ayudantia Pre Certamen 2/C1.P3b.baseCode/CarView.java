import javafx.scene.shape.Rectangle;

public class CarView extends Rectangle{
   public CarView (Car c) {
      super(40, 30);
      setX(c.getX());
      //???
   }
   public void update(){
      //???
   }
   private Car car;
}