package modelo;
public class Docente extends Persona{
    @Override
    public String getEmail(){
        return dni + "@ulima.edu.pe";    
    }

    @Override
    public String toString() {
        return "Docente{" + getEmail()+'}'+super.toString();
    }
    
    
    
}
