package Empresa.Agricola;

public class PeriodoCosecha {
    private String NombrePeriodo;
    private double CantidadToneladas;


    public PeriodoCosecha(String nombrePeriodo, double cantidadToneladas) {
        NombrePeriodo = nombrePeriodo;
        CantidadToneladas = cantidadToneladas;
    }

    public double ProduccionTotal(double Hectareas) {
        return CantidadToneladas*Hectareas;

    }
    public double CostoProduccion(double Hectareas, double CostoTonleadas){
        return ProduccionTotal(Hectareas)*CostoTonleadas;
    }

    public double gananciaTotal(double Hectareas,double CostoToneladas, double precioVenta){
        double produccion=ProduccionTotal(Hectareas);
        return (produccion*precioVenta)- (produccion*CostoToneladas);
    }

    @Override
    public String toString() {
        return "PeriodoCosecha{" +
                "NombrePeriodo='" + NombrePeriodo + '\'' +
                ", CantidadToneladas=" + CantidadToneladas +
                '}';
    }
}
