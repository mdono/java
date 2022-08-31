
package intecap.manuel.java;

import intecap.manuel.encripta.StringMD;

public class Manuel {
    
    public static void main(String[] args) {
        StringMD instancia = new StringMD();
        
        System.out.println(instancia.getMensajeDigito("Guate", "MD2"));
        System.out.println(instancia.getMensajeDigito("Guate", "MD5"));
        System.out.println(instancia.getMensajeDigito("Guate", "SHA-1"));
        System.out.println(instancia.getMensajeDigito("Guate", "SHA-256"));
        System.out.println(instancia.getMensajeDigito("Guate", "SHA-384"));
        System.out.println(instancia.getMensajeDigito("Guate", "SHA-512"));
    }
}
