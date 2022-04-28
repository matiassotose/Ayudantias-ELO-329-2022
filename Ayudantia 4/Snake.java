import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;


public class Snake extends Application {

    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static final int blockSize = 40;
    public static final int appHeight = 15 * blockSize;
    public static final int appWidth = 20 * blockSize;

    private Direction direction = Direction.RIGHT;
    private boolean moved = false;
    private boolean running = false;

    private Timeline timeline = new Timeline();

    private ObservableList<Node> snake;

    private Parent createContent(){
        Pane root = new Pane();
        root.setPrefSize(appWidth,appHeight);

        Group snakeBody = new Group();
        snake = snakeBody.getChildren();

        Rectangle food = new Rectangle(blockSize,blockSize);
        food.setFill(Color.BLUE);
        food.setTranslateX(/*??*/);
        food.setTranslateY(/*??*/);

        KeyFrame frame = new KeyFrame(Duration.seconds(0.2), actionEvent -> {
            if(!running)
                return;
            boolean toRemove = snake.size() > 1;

            Node tail = toRemove ? snake.remove(snake.size()-1):snake.get(0);

            double tailX = tail.getTranslateX();
            double tailY = tail.getTranslateY();

            switch (direction){
                case UP:
                    /*??*/
                    break;
                case DOWN:
                    /*??*/
                    break;
                case LEFT:
                    /*??*/
                    break;
                case RIGHT:
                    /*??*/
                    break;
            }

            moved = true;

            if(toRemove)
                snake.add(0,tail);

            //COLISIONES

            for(Node rect:snake){
                if(/*??*/){
                    restartGame();
                    break;
                }
            }

            if (/*??*/){
                restartGame();
            }

            //Generar mas comida y alargar serpiente

            if(/*??*/){
                /*??*/
            }
        });

        timeline.getKeyFrames().add(frame);
        timeline.setCycleCount(Timeline.INDEFINITE);

        root.getChildren().addAll(food, snakeBody);
        return root;
    }

    private boolean inRange(double snakePos, double foodPos){
        if(snakePos<=foodPos+blockSize && snakePos>=foodPos-blockSize)
            return true;
        else return false;
    }

    private void restartGame(){
        stopGame();
        startGame();
    }

    private void startGame(){
        direction = Direction.RIGHT;
        Rectangle head = new Rectangle(blockSize,blockSize);
        snake.add(head);
        /*??*/
    }

    private void stopGame(){
        /*??*/
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Scene scene = new Scene(createContent());
        scene.setOnKeyPressed(keyEvent -> {
            if(moved){
                switch (keyEvent.getCode()){
                    case W:
                        /*??*/
                        break;
                    case S:
                        /*??*/
                        break;
                    case A:
                        /*??*/
                        break;
                    case D:
                        /*??*/
                        break;
                }
            }
            moved = false;
        });

        primaryStage.setTitle("Culebra Truco");
        primaryStage.setScene(scene);
        primaryStage.show();
        startGame();
    }
    public static void main(String[] args) {
        launch(args);
    }
}