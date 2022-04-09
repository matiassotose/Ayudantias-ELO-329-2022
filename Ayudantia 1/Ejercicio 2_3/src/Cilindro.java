public class Cilindro extends Circulo{

    private int altura;

    public Cilindro(){
        super();
        altura = 0;
    }

    public Cilindro(int radio, int altura){
        super(radio);
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return super.getArea()*altura + 2*Math.PI*Math.pow(this.radio, 2);
    }

    @Override
    public double getPerimetro() {
        return 2*radio + altura;
    }

    public double getVolumen(){
        return super.getArea() * altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
