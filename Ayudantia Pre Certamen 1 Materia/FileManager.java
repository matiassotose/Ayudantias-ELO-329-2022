import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {
    private ArrayList<Product> rowData = new ArrayList<>();
    private String fileName;

    public FileManager(String fileName) {
        this.fileName = fileName;
    }

    public ArrayList<Product> getRowData() throws FileNotFoundException {
        Scanner fileReader = openFileScanner();
        while (fileReader.hasNextLine()) {
            String data = fileReader.nextLine();
            rowData.add(new Product(data));
        }
        fileReader.close();

        return rowData;
    }

    private Scanner openFileScanner() throws FileNotFoundException {
        FileInputStream inputFile = new FileInputStream(fileName);
        return new Scanner(inputFile);
    }
}
