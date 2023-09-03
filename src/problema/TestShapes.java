package problema;

public class TestShapes {
    public static void main(String[] args){
        Shape cir1 = new Shape(new Punto(), 12.6, ShapeType.CIRCLE); 
        Shape cua1 = new Shape(new Punto(), 45.98, ShapeType.SQUARE);
        Shape cir2 = new Shape(new Punto(), 6.76, ShapeType.CIRCLE);
        Shape cua2 = new Shape(new Punto(), 56.90, ShapeType.SQUARE);
        Shape tri1 = new Shape(new Punto(), 
                new Punto(),new Punto(), ShapeType.TRIANGLE);
        // Arreglo de figuras
        Shape[] shapes = new Shape[5];
        shapes[0] = cir1;
        shapes[1] = cua1;
        shapes[2] = cir2;
        shapes[3] = cua2;
        shapes[4] = tri1;
        
        // Dibujador de figuras
        Picture p = new Picture(shapes);
        p.drawAllShapes();
        
    }
    
}
