import java.util.ArrayList;

public class CuerpoCeleste implements Comparable<CuerpoCeleste>, java.util.Comparator<CuerpoCeleste> {

    private String nombre;
    private double distanciaALaTierra;
    private String unidadDistancia;
    private String composicion;
    private ArrayList<Observacion> observaciones;

    public CuerpoCeleste() { this.observaciones = new ArrayList<>(); }

    public CuerpoCeleste(String nombre, double distancia, String unidad, String composicion) {
        this.nombre = nombre;
        this.distanciaALaTierra = distancia;
        this.unidadDistancia = unidad;
        this.composicion = composicion;
        this.observaciones = new ArrayList<>();
    }

    public double[] getDesplazamiento(Observacion o1, Observacion o2) {
        double difLat = o2.getUbicacion().getGradosLatitud() - o1.getUbicacion().getGradosLatitud();
        double difLon = o2.getUbicacion().getGradosLongitud() - o1.getUbicacion().getGradosLongitud();
        return new double[]{ difLat, difLon };
    }

    @Override
    public int compareTo(CuerpoCeleste o) { return this.nombre.compareTo(o.nombre); }

    @Override
    public int compare(CuerpoCeleste c1, CuerpoCeleste c2) { return Double.compare(c1.distanciaALaTierra, c2.distanciaALaTierra); }

    public void agregarObservacion(Observacion o) { observaciones.add(o); }
    public String getNombre() { return nombre; }
    public ArrayList<Observacion> getObservaciones() { return observaciones; }
}