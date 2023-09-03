package solucion;
//El padre Shape hereda su metodo a esta clase con extends.
//Y al llamar ese metodo lo hace con @Override
public class Square extends Shape{
    private Punto left;
    private double lado;

    public Square(Punto left, double lado) {
        this.left = left;
        this.lado = lado;
    }

    @Override
    public void draw() {
        System.out.println("Imprimir un cuadrado");
    }
    
    
}
