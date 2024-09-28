package src;


public class Heroe extends Personaje {
    public Heroe(String nombre) {
        super(nombre, 100); 
    }

    public void interactuar() {
        System.out.println(getNombre() + " se prepara para la aventura.");
    }
}
