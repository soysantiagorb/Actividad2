package observatorio;

public class cuerposCelestes {

        private String nombre;
        private double composicion;
        private double distanciaTierra;
        private double unidadTierra;

        public cuerposCelestes(String nombre, double composicion, double distanciaTierra, double unidadTierra) {
            this.nombre = nombre;
            this.composicion = composicion;
            this.distanciaTierra = distanciaTierra;
            this.unidadTierra = unidadTierra;
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

