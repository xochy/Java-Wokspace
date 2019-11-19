package cap02.figuras;

public class Triangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    public Triangulo(double base, double altura){

        super("Triangulo");

        this.base   = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        
        return base * altura / 2;
    }
}