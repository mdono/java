
package intecap.manuel.encripta;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class StringMD {
    
    /*
        MD y SHA
        MD2,5 // SHA1/512
    */
    
    public static String toHexadecimal(byte[] digito) {
        String hash = "";
        int b = 0;
        
        for(byte aux : digito) {
            b = aux & 0xff;
            
            if(Integer.toHexString(b).length() != 1) {
                hash += Integer.toHexString(b);
            }
        }
        
        return hash;
    }
    
    public String getMensajeDigito(String mensaje, String algoritmo) {
        byte[] digito = null;
        byte[] buffer = mensaje.getBytes();
        
        try {
            MessageDigest mensajeDigito = MessageDigest.getInstance(algoritmo);
            mensajeDigito.reset();
            mensajeDigito.update(buffer);
            digito = mensajeDigito.digest();
        } catch(NoSuchAlgorithmException ex) {
            System.err.println("Err: " + ex.getMessage());
        }
        
        return toHexadecimal(digito);
    }
}
