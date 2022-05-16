public class Product {
    public Product(String fileRow){
        String[] row = fileRow.split(";");
        this.id = row[0];
        this.timestamp = row[1];
        this.category = row[2];
        this.product = row[3];
        this.brand = row[4];
        this.size = row[5];
        this.availability = row[7];

        try{
            this.price = Integer.parseInt(row[6]);
        } catch (NumberFormatException e){
            this.price = 0;
        }
    }

    public void printFormatted(){
        System.out.println("Item Id: "+id+", product: "+product+", brand:"+brand+
                ", price:"+price+", availability: "+availability);
    }

    public boolean getAvailability(){
        if (availability.equals("TRUE")){
            return true;
        } else {
            return false;
        }
    }

    public String getBrand() {
        return brand;
    }
    public int getPrice(){
        return price;
    }

    private final String id;
    private final String timestamp;
    private final String category;
    private final String product;
    private final String brand;
    private final String size;
    private final String availability;
    private int price;

}
