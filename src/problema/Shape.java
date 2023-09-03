package problema;

public class Shape {
    // Atributos
    private Punto point; // centro del circulo // esquina del cuadrado
    private double value; // radio del circulo // lado del cuadrado
    public ShapeType type;
    // Atributos solo para el triangulo
    private Punto p1;
    private Punto p2;
    private Punto p3;
    
    // Metodos
    public Shape(Punto pPoint, double pValue, ShapeType pType){
        point = pPoint;
        value = pValue;
        type = pType; 
    }    
    public Shape (Punto pP1, Punto pP2, Punto pP3, ShapeType pType){
        p1 = pP1;
        p2 = pP2;
        p3 = pP3;
        type = pType;
    }
    
}
