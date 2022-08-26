
public class Manuel {

    public static void main(String[] args) {
        LeerFile instancia = new LeerFile();
        
        instancia.abrirArchivo();
        instancia.leerArchivo();
        instancia.cerrarArchivo();
    }
}
