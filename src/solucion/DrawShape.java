package solucion;

public class DrawShape {
    //Estamos creando una array de objetos.
    //Cada objeto Shape tiene su metodo draw.
    private Shape[] figuras;

    public DrawShape(Shape[] shapes) {
        this.figuras = shapes;
    }
    public void dibujar(){
        //s es el indice que recorrera todo el array shapes(figuras)
        for (Shape s : figuras) {
            s.draw(); // metodo polimorfico
        }
    }
    
}
