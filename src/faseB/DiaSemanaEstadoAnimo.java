package faseB;

public class DiaSemanaEstadoAnimo {

    enum DiasSemana {
        LUNES("¡Ni me hables!"),
        MARTES("Ni te cases ni te embarques"),
        MIÉRCOLES("meh..."),
        JUEVES("Ahí estamos, ya falta poco"),
        VIERNES("¡Por fin ya es viernes!"),
        SÁBADO("Ahh, El finde ... (relax)"),
        DOMINGO("Ahh, El finde ... :'-( (depre)");

        private final String estadoAnimo;

        DiasSemana(String estadoAnimo) {
            this.estadoAnimo = estadoAnimo;
        }
        
        public String getEstadoAnimo() {
            return this.estadoAnimo;
        }
    }
}
