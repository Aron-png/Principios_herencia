package solucion;
//El padre Shape hereda su metodo a esta clase con extends.
//Y al llamar ese metodo lo hace con @Override
public class Circle extends Shape{
    private Punto center;
    private double radio;

    public Circle(Punto center, double radio) {
        this.center = center;
        this.radio = radio;
    }
    
    // Implementacion de un metodo abstracto
    @Override
   public void draw(){
        System.out.println("Imprimir un Circulo con radio: "+radio+
                " y punto de centro: "+this.center);
   } 
}
