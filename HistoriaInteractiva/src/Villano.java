package src;


public class Villano extends Personaje {
    public Villano(String nombre) {
        super(nombre, 80); 
    }

    public void interactuar() {
        System.out.println(getNombre() + " está tramando algo malvado.");
    }
}
