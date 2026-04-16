import java.util.ArrayList;
import java.util.Objects;
import java.util.Comparator;

public class CuerpoCeleste implements Comparable<CuerpoCeleste>, Comparator<CuerpoCeleste> {
    private String nombre;
    private double distanciaALaTierra;
    private String unidadDistancia;
    private String composicion;
    private ArrayList<Observacion> observaciones;

    public CuerpoCeleste() { this.observaciones = new ArrayList<>(); }

    public CuerpoCeleste(String nombre, double distanciaALaTierra, String unidadDistancia, String composicion) {
        this.nombre = nombre;
        this.distanciaALaTierra = distanciaALaTierra;
        this.unidadDistancia = unidadDistancia;
        this.composicion = composicion;
        this.observaciones = new ArrayList<>();
    }

    public double[] getDesplazamiento(Observacion o1, Observacion o2) {
        double difLatitud = o2.getUbicacion().getGradosLatitud() - o1.getUbicacion().getGradosLatitud();
        double difLongitud = o2.getUbicacion().getGradosLongitud() - o1.getUbicacion().getGradosLongitud();
        return new double[]{ difLatitud, difLongitud };
    }

    @Override
    public int compareTo(CuerpoCeleste o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public int compare(CuerpoCeleste c1, CuerpoCeleste c2) {
        return Double.compare(c1.distanciaALaTierra, c2.distanciaALaTierra);
    }

    public void agregarObservacion(Observacion o) { observaciones.add(o); }
    public String getNombre() { return nombre; }
    public ArrayList<Observacion> getObservaciones() { return observaciones; }
}