package fabrica.ropa;
import java.time.LocalDate;
public class lote {

        private int numDeLote;
        private int numDePIezas;
        private LocalDate fechadeFabricacion;
        private double costoProduccionPz;

        public lote(int numDeLote, int numDePIezas, LocalDate fechadeFabricacion, double costoProduccionPz) {
            this.numDeLote = numDeLote;
            this.numDePIezas = numDePIezas;
            this.fechadeFabricacion = fechadeFabricacion;
            this.costoProduccionPz = costoProduccionPz;
        }

        public double costoProduccionLote(){
            return numDePIezas*costoProduccionPz;
        }
        public double calcularMontoRecuperacion(){
            double precioVenta=costoProduccionPz*1.15;
            return numDePIezas*precioVenta;
        }

        @Override
        public String toString() {
            return "lote{" +
                    "numDeLote=" + numDeLote +
                    ", numDePIezas=" + numDePIezas +
                    ", fechadeFabricacion=" + fechadeFabricacion +
                    '}';
        }
    }

