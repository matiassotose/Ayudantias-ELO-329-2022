public class Car {
   public Car(double x, double y) {
      this.x=x;
      this.y=y;
   }
   public void turnLeft(){
      angle-=Math.PI/4;
   }
   public void turnRight(){
      angle+=Math.PI/4;
   }
   public void move(){
      x+=10*Math.cos(angle);
      y+=10*Math.sin(angle);
   }
   public String toString() {
      return x + ", " + y + ", " + angle + "\n";
   }
   private double x, y;
   private double angle;
}