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
    
    public void cambiarMarca(String nuevaMarca){
        marca = nuevaMarca;
    }
    
    public void cambiarAnoProduccion(int nuevoAnoProduccion){
        anoProduccion = nuevoAnoProduccion;
    }
    
    public void cambiarPlacaBase(PlacaBase nuevaPlacaBase){
        placaBase = nuevaPlacaBase;
    }

     public void imprimirDetalles(){
        System.out.println("Marca: "+ marca + ", Ano de produccion: " + anoProduccion + 
        ", Placa Base Modelo: " + placaBase.getModelo() + ", Placa Base NS: " + placaBase.getNumeroSerie() );
    }
}