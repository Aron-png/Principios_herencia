package modelo;
public abstract class Persona {
    //Atributo
    //Todas las clases hijas tienen acceso a este atributo, pero sin ser publico
    //para que personas que no tengan que ver con nada en el sistema lo cambie.
    protected int dni;
    //metodo abstracto
    public abstract String getEmail();
    //Metodo de instancia
    public String toString(){
        return "persona{"+"dni: "+dni+'}';
    }
}
