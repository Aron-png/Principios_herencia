package Practica1;
public class Ejecutar {
    public static void main(String[] args) {
        
        SerVivo per1 = new Persona(
                "la mano", new VelocidadProm(50.0,30.0),1);
        
        SerVivo dog1 = new Perro(
                "la pata", 
                new VelocidadProm(100.0,30.0),"ladridos",2);
        
        SerVivo cat1 = new Gato(
                new VelocidadProm(80.0,30.0),"maullidos",3);
        
        SerVivo[] alive = new SerVivo[3];
        alive[0] = per1;
        alive[1] = dog1;
        alive[2] = cat1;
        
        ArraySeresVivos app = new ArraySeresVivos(alive);
        app.ImprimirArray();
        
    }
    
}
