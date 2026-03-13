public class Ubicacion {

    private double gradosLatitud;
    private String dirLatitud;   // "Norte" o "Sur"
    private double gradosLongitud;
    private String dirLongitud;  // "Este" o "Oeste"

    public Ubicacion(double gradosLatitud, String dirLatitud,
                     double gradosLongitud, String dirLongitud) {
        this.gradosLatitud  = gradosLatitud;
        this.dirLatitud     = dirLatitud;
        this.gradosLongitud = gradosLongitud;
        this.dirLongitud    = dirLongitud;
    }

    public double getGradosLatitud() {
        return gradosLatitud;
    }

    public void setGradosLatitud(double gradosLatitud) {
        this.gradosLatitud = gradosLatitud;
    }

    public String getDirLatitud() {
        return dirLatitud;
    }

    public void setDirLatitud(String dirLatitud) {
        this.dirLatitud = dirLatitud;
    }

    public double getGradosLongitud() {
        return gradosLongitud;
    }

    public void setGradosLongitud(double gradosLongitud) {
        this.gradosLongitud = gradosLongitud;
    }

    public String getDirLongitud() {
        return dirLongitud;
    }

    public void setDirLongitud(String dirLongitud) {
        this.dirLongitud = dirLongitud;
    }

    @Override
    public String toString() {
        return gradosLatitud + "° " + dirLatitud + ", " +
                gradosLongitud + "° " + dirLongitud;
    }
}