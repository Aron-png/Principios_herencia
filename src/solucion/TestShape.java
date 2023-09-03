package solucion;

public class TestShape {
    public static void main(String[] args) {
        
        Shape cir1 = new Circle(new Punto(), 12.6); 
        Shape cua1 = new Square(new Punto(), 45.98);
        Shape cir2 = new Circle(new Punto(), 1222.6); 
        Shape cua2 = new Square(new Punto(), 56.90);
        Shape[] ArrayShapes = new Shape[4];
        ArrayShapes[0] = cir1;
        ArrayShapes[1] = cua1;
        ArrayShapes[2] = cir2;
        ArrayShapes[3] = cua2;
        DrawShape appDraw = new DrawShape(ArrayShapes);
        appDraw.dibujar();
        
    }
    
}
