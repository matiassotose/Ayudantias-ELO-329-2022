import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;

public class SearchBar  extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FileManager fileManager = new FileManager("data_example_csv.csv");
        ArrayList<Product> rowData = fileManager.getRowData();
        Search search = new Search(rowData);

        GridPane gridPane = createGrid();
        final TextField searchField = new TextField();

        createTextField(gridPane,searchField);
        createButton(gridPane,searchField,search);

        stage.setTitle("Barra de Busqueda");
        stage.setScene(new Scene(gridPane, 300, 275));
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }

    private GridPane createGrid() {
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);

        return gridPane;
    }

    private void createTextField(GridPane gridPane, TextField searchField){
        searchField.setPromptText("Ingrese Marca");
        searchField.setPrefColumnCount(10);

        GridPane.setConstraints(searchField,0,0);
        gridPane.getChildren().add(searchField);
    }

    private void createButton(GridPane gridPane, TextField searchField, Search search) {
        Button searchButton = new Button("Buscar");
        searchButton.setOnAction(actionEvent -> {
            String searchText = searchField.getText();
            search.performSearch(searchText);
        });

        GridPane.setConstraints(searchButton,1,0);
        gridPane.getChildren().add(searchButton);
    }
}
