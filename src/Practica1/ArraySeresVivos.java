package Practica1;
public class ArraySeresVivos {
    private SerVivo[] Vivo;

    public ArraySeresVivos(SerVivo[] Vivo) {
        this.Vivo = Vivo;
    }
    
    public void ImprimirArray(){
        for(SerVivo s : Vivo){
            s.imprimir();
        }
    }
}
