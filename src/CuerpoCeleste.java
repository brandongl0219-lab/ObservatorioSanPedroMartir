import java.util.ArrayList;

public class CuerpoCeleste {

    private String nombre;
    private double distanciaALaTierra;
    private String unidadDistancia;   // "años luz" o "km/s"
    private String composicion;       // gases, sólidos, líquidos
    private ArrayList<Observacion> observaciones;

    public CuerpoCeleste(String nombre, double distanciaALaTierra,
                         String unidadDistancia, String composicion) {
        this.nombre             = nombre;
        this.distanciaALaTierra = distanciaALaTierra;
        this.unidadDistancia    = unidadDistancia;
        this.composicion        = composicion;
        this.observaciones      = new ArrayList<>();
    }


    public void agregarObservacion(Observacion o) {observaciones.add(o);}


    public double[] getDesplazamiento(Observacion o1, Observacion o2) {
        double difLatitud  = o2.getUbicacion().getGradosLatitud()
                - o1.getUbicacion().getGradosLatitud();
        double difLongitud = o2.getUbicacion().getGradosLongitud()
                - o1.getUbicacion().getGradosLongitud();
        return new double[]{ difLatitud, difLongitud };
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDistanciaALaTierra() {
        return distanciaALaTierra;
    }

    public void setDistanciaALaTierra(double distanciaALaTierra) {
        this.distanciaALaTierra = distanciaALaTierra;
    }

    public String getUnidadDistancia() {
        return unidadDistancia;
    }

    public void setUnidadDistancia(String unidadDistancia) {
        this.unidadDistancia = unidadDistancia;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public ArrayList<Observacion> getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return "CuerpoCeleste{" +
                "nombre='" + nombre + '\'' +
                ", distancia=" + distanciaALaTierra + " " + unidadDistancia +
                ", composicion='" + composicion + '\'' +
                ", observaciones=" + observaciones.size() +
                '}';
    }
}