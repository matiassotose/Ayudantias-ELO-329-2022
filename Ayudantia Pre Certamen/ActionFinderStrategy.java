import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ActionFinderStrategy {
    public static void performAction (String[] args, ArrayList<Product> rowData) throws ArgumentInputException {
        try {
            if (args[0].equals("-s") && args[1].equals("-brand")) {
                Search search = new Search(rowData);
                search.performSearch(args[2]);
            } else if (args[0].equals("-o")) {
                Sort sort = new Sort(rowData);
                sort.performSort();
                for(Product product:rowData){
                    product.printFormatted();
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ArgumentInputException("Debe ingresar argumentos al programa: -s -> Buscar, -brand -> Por marca, -o -> Ordenar, -desc -> De mayor a menor");
        }
    }
}
