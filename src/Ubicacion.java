import java.util.Objects;

public class Ubicacion {
    private double gradosLatitud;
    private String dirLatitud;
    private double gradosLongitud;
    private String dirLongitud;

    public Ubicacion(double gradosLatitud, String dirLatitud, double gradosLongitud, String dirLongitud) {
        this.gradosLatitud = gradosLatitud;
        this.dirLatitud = dirLatitud;
        this.gradosLongitud = gradosLongitud;
        this.dirLongitud = dirLongitud;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion ubicacion = (Ubicacion) o;
        return Double.compare(ubicacion.gradosLatitud, gradosLatitud) == 0 &&
                Double.compare(ubicacion.gradosLongitud, gradosLongitud) == 0 &&
                Objects.equals(dirLatitud, ubicacion.dirLatitud) &&
                Objects.equals(dirLongitud, ubicacion.dirLongitud);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gradosLatitud, dirLatitud, gradosLongitud, dirLongitud);
    }

    public double getGradosLatitud() { return gradosLatitud; }
    public double getGradosLongitud() { return gradosLongitud; }

    @Override
    public String toString() {
        return gradosLatitud + "° " + dirLatitud + ", " + gradosLongitud + "° " + dirLongitud;
    }
}