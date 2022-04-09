public class Circulo {

    protected int radio;

    public Circulo(){
        radio = 0;
    }
    public Circulo(int radio){
        this.radio = radio;
    }

    public double getPerimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }

    public double getArea(){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
}
