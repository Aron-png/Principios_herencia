package problema;

public class Picture {
    // Atributos
    private Shape[] shapes;
    // Metodos
    public Picture(){
        shapes = new Shape[100];
    }
    public Picture(Shape[] pShapes){
        shapes = pShapes;
    }    
    public void drawCircle(Shape c){
        System.out.println("Imprimir un Circulo: "+c);
    }
    public void drawSquare(Shape s){
        System.out.println("Imprimir un Cuadrado: "+s);
    }
    public void drawTriangle(Shape t){
        System.out.println("Imprimir un Triangulo: "+t);
    }    
    public void drawAllShapes(){
        for (Shape s : shapes) {
            switch (s.type){
                case CIRCLE: drawCircle(s); break;
                case SQUARE: drawSquare(s); break; 
                case TRIANGLE: drawTriangle(s); break;
            }
        }        
    }
}
