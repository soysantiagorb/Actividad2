package fabrica.ropa;

public class prenda {

        private String modelo;
        private String Tela;
        private double precioventaPZ;
        private String genero;
        private String temporada;

        public prenda(String modelo, String tela, double precioventaPZ, String genero, String temporada) {
            this.modelo = modelo;
            Tela = tela;
            this.precioventaPZ = precioventaPZ;
            this.genero = genero;
            this.temporada = temporada;
        }

        public double precioventaPZ() {
            return precioventaPZ*1.15;
        }

        @Override
        public String toString() {
            return "prenda{" +
                    "modelo='" + modelo + '\'' +
                    ", Tela='" + Tela + '\'' +
                    ", precioventaPZ=" + precioventaPZ +
                    ", genero='" + genero + '\'' +
                    ", temporada='" + temporada + '\'' +
                    '}';
        }
    }

