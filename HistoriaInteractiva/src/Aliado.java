package src;

public class Aliado extends Personaje {
    public Aliado(String nombre) {
        super(nombre, 60); 
    }

    public void interactuar() {
        System.out.println(getNombre() + " se une a la causa.");
    }
}
