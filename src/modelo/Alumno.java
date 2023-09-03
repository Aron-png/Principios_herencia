package modelo;
public class Alumno extends Persona{
    private int codigo;
    private String nombre;
    private String apelidos;
    @Override
    public String getEmail() {
        return dni + "@aloe.ulima.edu.pe";
    }
    @Override
    public String toString() {
        return "Alumno{ "+getEmail()+"} "+super.toString();
    }
}
