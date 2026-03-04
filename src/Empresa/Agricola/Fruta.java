package Empresa.Agricola;
import java.lang.reflect.Array;
import java.util.ArrayList;
public class Fruta {

    private String NombreFruta;
    private double Hectareas;
    private double CostoProduccionToneladas;
    private double PrecioVentaToneladas;
    private String Periodo;
    private String PeriodoCosecha;
    private ArrayList <PeriodoCosecha> periodos;

    public Fruta(String nombreFruta, double hectareas, ArrayList periodoCosecha, String periodoCosecha1, String periodo, double precioVentaToneladas, double costoProduccionToneladas) {
        NombreFruta = nombreFruta;
        Hectareas = hectareas;
        PeriodoCosecha = PeriodoCosecha;
        Periodo = periodo;
        PrecioVentaToneladas = precioVentaToneladas;
        CostoProduccionToneladas = costoProduccionToneladas;
    }

    public void setAgregarPeriodo(PeriodoCosecha periodo) {
        periodos.add(periodo);

    }

    public void setAgregarPeriodoCosecha(PeriodoCosecha periodo) {
        periodos.remove(periodo);


    }

    @Override
    public String toString() {
        return "Fruta{" +
                "NombreFruta='" + NombreFruta + '\'' +
                ", Hectareas=" + Hectareas +
                ", PrecioVentaToneladas=" + PrecioVentaToneladas +
                ", CostoProduccionToneladas=" + CostoProduccionToneladas +
                '}';
    }
}


