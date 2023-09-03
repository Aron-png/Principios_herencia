package Practica1;
public abstract class SerVivo {
    //protected
    //Todas las clases hijas tiene acceso a este atributo, pero sin permitir que
    //persona fuera del sistema puedan modificar su valor.
    protected int id;
    public SerVivo(int id){
        this.id = id;
    }
    public String toId(){
        return "Ser Vivo{ "+"Id: "+id;
    }
    public abstract void imprimir();
}
