package src;


public class Personaje {
    private String nombre;
    private int puntosDeVida;

    public Personaje(String nombre, int puntosDeVida) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public void recibirDanio(int danio) {
        puntosDeVida -= danio;
        if (puntosDeVida < 0) puntosDeVida = 0;
    }
}
