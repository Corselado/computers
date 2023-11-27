public class PlacaBase {
    String modelo;
    int numeroSerie;

    public PlacaBase(String nuevoModelo, int nuevoNumeroSerie) {
        modelo = nuevoModelo;
        numeroSerie = nuevoNumeroSerie;
    }

    public String getModelo() {
        return modelo;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setModelo(String nModelo) {
        modelo = nModelo;
    }

    public void setNumeroSerie(int nNumeroSerie) {
        numeroSerie = nNumeroSerie;
    }
}
