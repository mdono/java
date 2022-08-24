public class Potpie {
    public int dia, mes, anio;
    
    public Potpie(int d, int m, int a) {
        this.dia = d;
        this.mes = m;
        this.anio = a;
        
        System.out.printf("El valor es: '%s', como retorno de la función.\n", this);
    }
    
    public String toString() {
        return String.format("La fecha es: %d/%d/%d", dia, mes, anio);
    }
}
