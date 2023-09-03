package Practica1;
public class Perro extends SerVivo implements EsDomestico{
    private String Saludar;
    private VelocidadProm Velo;
    private String Sonido;

    public Perro(String Saludar, VelocidadProm Velo, String Sonido, int id) {
        super(id);
        this.Saludar = Saludar;
        this.Velo = Velo;
        this.Sonido = Sonido;
    }
    
    @Override
    public void domestico(){
        System.out.println("Por otro lado, "
                + "los perros pueden vivir facilmente en domicilios.");
    };
    
    @Override
    public void imprimir(){
        System.out.println(super.toId()+"} Informacion adicional: ");
        System.out.println("El perro es un animal que corre a "+
                Velo.ImprimeVelodicad() +
                " metros por segundo. Cuando saluda lo hace con "+Saludar
                +" y emite "+Sonido+".");
        domestico();
        System.out.println();
    }
    
}
