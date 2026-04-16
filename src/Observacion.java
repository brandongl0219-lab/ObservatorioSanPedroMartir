import java.util.ArrayList;
import java.util.Objects;

public class Observacion implements Comparable<Observacion> {

    private ArrayList<String> meses;
    private Ubicacion ubicacion;

    public Observacion(ArrayList<String> meses, Ubicacion ubicacion) {
        this.meses = meses;
        this.ubicacion = ubicacion;
    }

    @Override
    public int compareTo(Observacion o) {
        return Integer.compare(o.meses.size(), this.meses.size());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Observacion that = (Observacion) o;
        return Objects.equals(meses, that.meses) && Objects.equals(ubicacion, that.ubicacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meses, ubicacion);
    }

    public ArrayList<String> getMeses() { return meses; }
    public Ubicacion getUbicacion() { return ubicacion; }

    @Override
    public String toString() {
        return "Observacion{meses=" + meses + ", ubicacion=" + ubicacion + "}";
    }
}
