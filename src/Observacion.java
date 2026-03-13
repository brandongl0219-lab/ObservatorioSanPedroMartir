import java.util.ArrayList;

public class Observacion {

    private ArrayList<String> meses;  // meses en que se observó en esta posición
    private Ubicacion ubicacion;

    public Observacion(ArrayList<String> meses, Ubicacion ubicacion) {
        this.meses    = meses;
        this.ubicacion = ubicacion;
    }

    public ArrayList<String> getMeses() {
        return meses;
    }

    public void setMeses(ArrayList<String> meses) {
        this.meses = meses;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    @Override
    public String toString() {
        return "Observacion{meses=" + meses + ", ubicacion=" + ubicacion + "}";
    }
}
