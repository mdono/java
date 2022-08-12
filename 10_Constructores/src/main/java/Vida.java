
public class Vida {
    private String primeraNovia;
    private int edadNovia;
    
    //constructor
    // primer constructor
    public Vida(String primeraNovia) {
        this.primeraNovia = primeraNovia;
    }
    
    // segundo constructor
    public void Vida(int edadNovia) {
        this.edadNovia = edadNovia;
    }
    
    // tercer constructor
    public void Vida(String primeraNovia, int edadNovia) {
        this.primeraNovia = primeraNovia;
        this.edadNovia = edadNovia;
    }
    
    public void Vida(int primeraNovia, int edadNovia) {
        this.edadNovia = primeraNovia;
        this.edadNovia = edadNovia;
    }
    
    public void Vida(int primeraNovia, int edadNovia, String primeraNovias) {
        this.edadNovia = primeraNovia;
        this.edadNovia = edadNovia;
    }

    public void diciendo() {
        System.out.println("Tu primera novia fue: " + primeraNovia);
    }
    
    public String getPrimeraNovia() {
        return primeraNovia;
    }
    
    public void setPrimeraNovia(String primeraNovia) {
        this.primeraNovia = primeraNovia;
    }
}