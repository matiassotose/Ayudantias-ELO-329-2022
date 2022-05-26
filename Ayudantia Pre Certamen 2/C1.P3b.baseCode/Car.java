public class Car {
   public Car(double x, double y) {
      this.x=x;
      this.y=y;
      view = new CarView(this);
   }
   public void turnLeft(){
      //???
   }
   public void turnRight(){
      //???
   }
   public void move(){
      //????
   }
   public String toString() {
      return x + ", " + y + ", "+ angle + "\n";
   }
   public double getX(){
      return x;
   }
   public double getY(){
      return y;
   }
   public double getDir(){
      return angle;
   }
   public CarView getView() {
      return view;
   }
   private double x, y;
   private CarView view;
   private double angle;
}