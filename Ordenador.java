public class Ordenador{
    private String marca;
    private int anoProduccion;
    private PlacaBase placaBase;
    
    public Ordenador(String nombreMarca, int elAnoProduccion, PlacaBase laPlacaBase){
        marca = nombreMarca;
        anoProduccion = elAnoProduccion;
        placaBase = laPlacaBase;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoProduccion() {
        return anoProduccion;
    }

    public PlacaBase getPlacaBase() {
        return placaBase;
    }
}