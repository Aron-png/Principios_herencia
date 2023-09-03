package Practica1;
public class Gato extends SerVivo implements EsDomestico{
    private VelocidadProm Velo;
    private String Sonido;
    
    public Gato(VelocidadProm Velo, String Sonido, int id) {
        super(id);
        this.Velo = Velo;
        this.Sonido = Sonido;
    }
    
    @Override
    public void domestico(){
        System.out.println("Por otro lado, "
                + "los gatos pueden vivir facilmente en domicilios.");
    };
    
    @Override
    public void imprimir(){
        System.out.println(super.toId()+"} Informacion adicional: ");
        System.out.println("El gato es un animal que corre a "+
                Velo.ImprimeVelodicad() +
                " metros por segundo. Ademas, emite "+Sonido+".");
        domestico();
        System.out.println();
    }
    
}
