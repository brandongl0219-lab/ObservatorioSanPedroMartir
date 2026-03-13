import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Ubicaciones
        Ubicacion ub1 = new Ubicacion(32.5, "Norte", 115.3, "Oeste");
        Ubicacion ub2 = new Ubicacion(35.1, "Norte", 118.7, "Oeste");

        // Observaciones
        ArrayList<String> meses1 = new ArrayList<>();
        meses1.add("Enero");
        Observacion obs1 = new Observacion(meses1, ub1);

        ArrayList<String> meses2 = new ArrayList<>();
        meses2.add("Junio");
        Observacion obs2 = new Observacion(meses2, ub2);

        // Cuerpo celeste
        CuerpoCeleste cometa = new CuerpoCeleste("Cometa X", 4.2, "años luz", "gases");
        cometa.agregarObservacion(obs1);
        cometa.agregarObservacion(obs2);

        // Desplazamiento
        double[] desp = cometa.getDesplazamiento(obs1, obs2);
        System.out.println("Desplazamiento de " + cometa.getNombre() + " ");
        System.out.println("Del periodo: " + obs1.getMeses() + " al periodo: " + obs2.getMeses());
        System.out.printf("Latitud : %.2f grados%n", desp[0]);
        System.out.printf("Longitud: %.2f grados%n", desp[1]);
    }
}