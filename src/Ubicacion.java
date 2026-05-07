import java.util.Objects;

public class Ubicacion {

    private double gradosLatitud;
    private String dirLatitud;
    private double gradosLongitud;
    private String dirLongitud;

    public Ubicacion(double lat, String dirLat, double lon, String dirLon)
            throws LatitudInvalidaException, LongitudInvalidaException {

        if (lat > 180) throw new LatitudInvalidaException(lat);
        if (lon > 180) throw new LongitudInvalidaException(lon);

        this.gradosLatitud = lat;
        this.dirLatitud = dirLat;
        this.gradosLongitud = lon;
        this.dirLongitud = dirLon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubicacion u = (Ubicacion) o;
        return Double.compare(u.gradosLatitud, gradosLatitud) == 0 &&
                Double.compare(u.gradosLongitud, gradosLongitud) == 0 &&
                Objects.equals(dirLatitud, u.dirLatitud) &&
                Objects.equals(dirLongitud, u.dirLongitud);
    }

    @Override
    public int hashCode() { return Objects.hash(gradosLatitud, dirLatitud, gradosLongitud, dirLongitud); }

    public double getGradosLatitud() { return gradosLatitud; }
    public double getGradosLongitud() { return gradosLongitud; }

    @Override
    public String toString() { return gradosLatitud + "° " + dirLatitud + ", " + gradosLongitud + "° " + dirLongitud; }
}