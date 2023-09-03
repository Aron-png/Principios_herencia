package modelo;
public class AppPersonas {
    public static void main(String[] args){
        // cast
        double x = 67777.98;
        byte y = (byte)x;//Perdida de info = Alumno obj = new Persona();
        
        //Ambos objetos son persona pero su creacion es diferente.
        //Estoy llamando a la funcion de GetEmail de una persona. En tiempo de
        //ejecucion, verifica que tipo de clase es el objeto y aplica su debido
        //uso.
        Persona obj1 = new Alumno();
        Persona obj2 = new Docente();
        
        //Invocar un metodo de polimorfismo
        System.out.println("email alumno:  "+obj1.getEmail());
        System.out.println("email docente:  "+obj2.getEmail());
        
        //Array de Personas
        Persona[] ArrayPersonas = new Persona[20];
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                ArrayPersonas[i] = new Alumno();
            }else{
                ArrayPersonas[i] = new Docente();
            }
        }
        for (Persona p: ArrayPersonas) {
            System.out.println("Email de la persona "+p.getEmail());
        }
    }
}
