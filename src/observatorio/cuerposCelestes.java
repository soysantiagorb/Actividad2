package observatorio;
import java.util.ArrayList;
public class cuerposCelestes {


        private String nombre;
        private double composicion;
        private double distanciaTierra;
        private double unidadTierra;
        private ArrayList <PeriodoVisible> periodos;

        public cuerposCelestes(String nombre, double composicion, double distanciaTierra, double unidadTierra, ArrayList<PeriodoVisible> periodos) {
            this.nombre = nombre;
            this.composicion = composicion;
            this.distanciaTierra = distanciaTierra;
            this.unidadTierra = unidadTierra;
            this.periodos = new ArrayList<>();
        }

        @Override
        public String toString() {
            return "cuerposCelestes{" +
                    "nombre='" + nombre + '\'' +
                    ", composicion=" + composicion +
                    ", distanciaTierra=" + distanciaTierra +
                    ", unidadTierra=" + unidadTierra +
                    '}';
        }
    }




