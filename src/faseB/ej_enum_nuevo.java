package faseB;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import faseB.DiaSemanaEstadoAnimo.DiasSemana;

public class ej_enum_nuevo {

    public static void main(String[] args) {
        DateTimeFormatter formateadoDiaSemana = DateTimeFormatter.ofPattern("EEEE", new Locale("es"));
        String diaDeHoy = LocalDateTime.now()
                                        .format(formateadoDiaSemana)
                                        .toUpperCase();
        
        System.out.println(diaDeHoy + ": " + DiasSemana.valueOf(diaDeHoy).getEstadoAnimo());
    }

}
