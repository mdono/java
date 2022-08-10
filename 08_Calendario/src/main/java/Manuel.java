
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class Manuel {
    public static void tiempoCalendario() {
        Date fecha = Calendar.getInstance().getTime();
        
        System.out.println("La fecha actual: " + fecha);
    }
    
    public static void formatoFecha() {
        Calendar fecha = Calendar.getInstance();
        SimpleDateFormat fechaFormato = new SimpleDateFormat("EEE dd/MM/yyyy ' a las ' hh:mm:ss a Z");
        
        System.out.println("La fecha actual con un formato es: " 
                + fechaFormato.format(fecha.getTime()));
    }
    
    public static void agregarFechas() {
        System.out.println("Realizando operaciones con las fechas del calendario");
        
        Calendar fecha = Calendar.getInstance();
        Calendar cldr;
        SimpleDateFormat sdf = new SimpleDateFormat("E dd/MM/yyyy ' a las ' hh:mm:ss a zzz");
        
        cldr = (Calendar) fecha.clone();
        cldr.add(Calendar.DAY_OF_YEAR, -(365*2));
        
        System.out.println("\tDos añs antes era: " + sdf.format(cldr.getTime()));
        
        cldr = (Calendar) fecha.clone();
        cldr.add(Calendar.DAY_OF_YEAR, +5);
        
        System.out.println("\tCinco días después de hoy será: " + sdf.format(cldr.getTime()));
    }
    
    public static void diferenciaFecha() {
        System.out.println("Diferencia entre fechas");
        
        Date fechaInicio = new GregorianCalendar(2005, 02, 24, 14, 00).getTime();
        Date fechaFin = new Date();
        
        long diferencia = fechaFin.getTime() - fechaInicio.getTime();
        System.out.println("\tDiferencia entre " + fechaFin + " y " + fechaInicio + " ");
        System.out.println("es de " + (diferencia / (1000L * 60L * 60L *24L)) + " días.");
    }
    
    public static void main(String[] args) {
        tiempoCalendario();
        //formatoFecha();
        agregarFechas();
        diferenciaFecha();
        formatoFecha();
    }
}