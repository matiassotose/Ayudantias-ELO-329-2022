import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Buscador {

    public static void Buscar(String filename, String word) throws Exception {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        String st = "";
        int counter = 0;
        while (scanner.hasNextLine()){
            st = scanner.nextLine();
            counter++;
            if(st.equals(word)){
                break;
            }
        }
        if(st.equals(word)){
            System.out.println("Palabra encontrada despues de buscar en "+counter+"lineas.");
        }
        else {
            System.out.println("Palabra no encontrada, son "+counter+"Palabras");
        }
    }

    public static void main(String[] args) throws Exception {
        if(args.length < 1){
            System.out.println("No se ingreso el nombre del archivo");
        }
        else if(args.length < 2){
            System.out.println("No se ingreso la palabra a buscar");
        }
        else {
            Buscar(args[0], args[1]);
        }
    }
}
