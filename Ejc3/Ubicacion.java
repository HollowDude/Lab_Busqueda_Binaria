package Ejc3;

public class Ubicacion {
    int coordenadas;
    String direccion;

    public Ubicacion(int coordenadas, String direccion) {
        this.coordenadas = coordenadas;
        this.direccion = direccion;
    }

    public int getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(int coordenadas) {
        this.coordenadas = coordenadas;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
