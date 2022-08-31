
public class Honda extends Carro {

    public Honda() {
        double kph = kph(83, 3.4);
        
        System.out.println("Kilómetros por galón " + kph);
    }
    
    @Override
    public void configuracionComputadora() {
        System.out.println("Computadora configurada");
    }

    @Override
    public void tamanoLlantas(int anio, String modelo) {
        System.out.println("Para el modelo " + modelo 
                + " necesitas llantas del año " + anio);
    }
}
