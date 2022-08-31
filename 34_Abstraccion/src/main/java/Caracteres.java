
interface Persona {
    String miNombre();
    String miPosicion();
    int miEdad();
}

public class Caracteres implements Personas {

    @Override
    public String miNombre() {
        return String.format("Mi nombre es %s\n", "Manuel");
    }

    @Override
    public String miPosicion() {
        return String.format("Mi posición es %s\n", "catedrático");
    }

    @Override
    public int miEdad() {
        return 37;
    }
}