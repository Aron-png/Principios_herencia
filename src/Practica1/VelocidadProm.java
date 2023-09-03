package Practica1;
public class VelocidadProm {
    private double metros;
    private double segundo;

    public VelocidadProm(double metros, double segundo) {
        this.metros = metros;
        this.segundo = segundo;
    }
    public double ImprimeVelodicad(){
        
        return metros/segundo;
    }
}
