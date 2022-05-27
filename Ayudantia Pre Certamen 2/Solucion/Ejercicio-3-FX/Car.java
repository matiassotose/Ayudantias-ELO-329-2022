public class Car {
   public Car(double x, double y) {
      this.x=x;
      this.y=y;
      view = new CarView(this);
   }
   public void turnLeft(){
      angle-=Math.PI/4;
      view.update();
   }
   public void turnRight(){
      angle+=Math.PI/4;
      view.update();
   }
   public void move(){
      x+=10*Math.cos(angle);
      y+=10*Math.sin(angle);
      view.update();
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