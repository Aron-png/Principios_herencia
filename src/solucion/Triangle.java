package solucion;
//El padre Shape hereda su metodo a esta clase con extends.
//Y al llamar ese metodo lo hace con @Override
public class Triangle extends Shape{
    Punto p1;
    Punto p2;
    Punto p3;

    public Triangle(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    

    @Override
    public void draw() {
        System.out.println("Imprimir un triangulo");
    }
    
}
