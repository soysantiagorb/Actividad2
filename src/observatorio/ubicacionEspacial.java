package observatorio;

public class ubicacionEspacial {

    private double latitud;
    private String hemisferioLatitud;
    private double longitud;
    private String hemisferioLongitud;

    public ubicacionEspacial(double latitud, String hemisferioLatitud, double longitud, String hemisferioLongitud) {
        this.latitud = latitud;
        this.hemisferioLatitud = hemisferioLatitud;
        this.longitud = longitud;
        this.hemisferioLongitud = hemisferioLongitud;
    }

    public double calcularDesplazamiento(double lat2, double long2){
        double dx=this.latitud-lat2;
        double dy=this.longitud-long2;
        return Math.sqrt(dx*dx+dy*dy);

    }

    @Override
    public String toString() {
        return "ubicacionEspacial{" +
                "longitud=" + longitud +
                ", latitud=" + latitud +
                '}';
    }
}