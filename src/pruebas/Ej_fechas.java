package pruebas;

import java.time.*;
import java.time.format.*;

public class Ej_fechas {

    public static void main(String[] args) {
        LocalDateTime fechaPrestamo;
        LocalDateTime fechaDevolucionLibro;
        LocalDateTime fechaDevolucionDVD;         
        
        DateTimeFormatter formatoDevolucionLibro;
        DateTimeFormatter formatoDevolucionDVD;
        
        // prestamo v
        fechaPrestamo = LocalDateTime.of(2018, 1, 30, 12, 0);
        // prestamo ^
        
        // libro v
        fechaDevolucionLibro = fechaPrestamo.plusDays(45);
        formatoDevolucionLibro = DateTimeFormatter.ofPattern("'La fecha de devolución del libro será el 'EEEE', 'dd' de 'MMMM' de 'y' '");        
        // libro ^
        
        // DVD v
        fechaDevolucionDVD = fechaPrestamo.plusDays(7);
        formatoDevolucionDVD = DateTimeFormatter.ofPattern("'y para el DVD será el 'EEE', 'dd'/'MM'/'yy' a las 'HH':'mm' 'a");
        // DVD ^

        System.out.print(fechaDevolucionLibro.format(formatoDevolucionLibro));
        System.out.print(fechaDevolucionDVD.format(formatoDevolucionDVD)); System.out.println("");
    }
}
