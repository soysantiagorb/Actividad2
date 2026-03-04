package observatorio;

public class PeriodoVisible {

        private String periodo;
        private ubicacionEspacial ubicacion;

        public PeriodoVisible(String periodo, ubicacionEspacial ubicacion) {
            this.periodo = periodo;
            this.ubicacion = ubicacion;
        }
        public ubicacionEspacial getUbicacion() {
            return ubicacion;

        }

        @Override
        public String toString() {
            return "periodoVisible{" +
                    "periodo='" + periodo + '\'' +
                    ", ubicacion=" + ubicacion +
                    '}';
        }
    }

