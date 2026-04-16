import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Ubicacion ub1 = new Ubicacion(32.5, "Norte", 115.3, "Oeste");
        Ubicacion ub2 = new Ubicacion(35.1, "Norte", 118.7, "Oeste");

        ArrayList<String> meses1 = new ArrayList<>(); meses1.add("Enero");
        Observacion obs1 = new Observacion(meses1, ub1);

        ArrayList<String> meses2 = new ArrayList<>(); meses2.add("Junio");
        Observacion obs2 = new Observacion(meses2, ub2);

        CuerpoCeleste cometa = new CuerpoCeleste("Cometa X", 4.2, "años luz", "gases");
        cometa.agregarObservacion(obs1);
        cometa.agregarObservacion(obs2);

        double[] desp = cometa.getDesplazamiento(obs1, obs2);

        System.out.println("=== MONITOREO ASTRONÓMICO ===");
        System.out.println("Cuerpo: " + cometa.getNombre());
        System.out.printf("Desplazamiento Latitud: %.2f°%n", desp[0]);
        System.out.printf("Desplazamiento Longitud: %.2f°%n", desp[1]);

        CuerpoCeleste estrella = new CuerpoCeleste("Sirio", 8.6, "años luz", "gases");
        System.out.println("\n¿Es igual a otra estrella?: " + cometa.equals(estrella));
    }
}