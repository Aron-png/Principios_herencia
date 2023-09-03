package modelo2;
public class Loro extends Pajaro implements AvesVoladoras{
    
    public void imitar(){
        System.out.println("Imitar a persona");
    }
    @Override
    public void volar(){
        System.out.println("El loro empieza a volar");
    }
    @Override
    public void caminar(){
        System.out.println("El loro empieza a caminar");
    }
    
}
