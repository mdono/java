
public class Tuna {
    
    public int suma;
    public final int NUMERO;
    
    public Tuna(int numero) {
        this.NUMERO = numero;
        //NUMERO += 1;
    }
    
    public void agregar() {
        suma += NUMERO;
        suma += 1;
    }
    
    @Override
    public String toString() {
        return String.format("La suma es: %d\n", suma);
    }
}
