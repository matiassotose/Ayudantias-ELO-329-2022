import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;

public class CarView extends Rectangle{
   public CarView (Car c) {
      super(c.getX(), c.getY(), 40, 30);
      car=c;
      Media media = new Media(MEDIA_URL);
      MediaPlayer mediaPlayer = new MediaPlayer(media);
      mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
      mediaPlayer.setVolume(0.1);
      mediaPlayer.play();
   }
   public void update(){
      setX(car.getX());
      setY(car.getY());
      setRotate(car.getDir()*180/Math.PI);
   }
   private Car car;
   private static final String MEDIA_URL =
           "http://profesores.elo.utfsm.cl/~agv/elo329/1s20/C1/carSound.mp3";
}