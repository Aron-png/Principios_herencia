package Practica1;
public class Persona extends SerVivo{
    private String Saludar;
    private VelocidadProm Velo;

    public Persona(String Saludar, VelocidadProm Velo, int id) {
        super(id);
        this.Saludar = Saludar;
        this.Velo = Velo;
    }
    
    @Override
    public void imprimir(){
        System.out.println(super.toId()+"} Informacion adicional: ");
        System.out.println(
                "La persona tiene una velocidad de "+ Velo.ImprimeVelodicad()
        +" metros por segundo. Ademas la forma de saludar es con "+Saludar+'.');
        System.out.println();
    }
}
