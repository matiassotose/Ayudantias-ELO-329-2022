import java.io.IOException;
import java.io.InputStream;

public class DrivenCar {
   public static void main(String[] argv) throws IOException {
      InputStream in = System.in; 
      Car a = new Car(100, 150);
      int c;
      do {
         c=in.read();
         switch(c) {
            case 'i': a.move(); break;
            case 'j': a.turnLeft();break;
            case 'k': a.turnRight();break;
            default: System.out.println(a);
         }
      }while (c !='e');  
   }
}