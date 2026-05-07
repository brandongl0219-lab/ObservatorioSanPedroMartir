import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Ubicacion ub1 = new Ubicacion(32.5, "Norte", 115.3, "Oeste");
            Ubicacion ub2 = new Ubicacion(35.1, "Norte", 118.7, "Oeste");

            ArrayList<String> m1 = new ArrayList<>();
            m1.add("Enero");
            ArrayList<String> m2 = new ArrayList<>();
            m2.add("Junio");

            Observacion obs1 = new Observacion(m1, ub1);
            Observacion obs2 = new Observacion(m2, ub2);

            CuerpoCeleste cometa = new CuerpoCeleste("Cometa X", 4.2, "años luz", "gases");
            cometa.agregarObservacion(obs1);
            cometa.agregarObservacion(obs2);

            double[] desp = cometa.getDesplazamiento(obs1, obs2);
            System.out.println("=== MONITOREO ASTRONÓMICO ===");
            System.out.println("Cuerpo: " + cometa.getNombre());
            System.out.printf("Desplazamiento Latitud: %.2f°%n", desp[0]);
            System.out.printf("Desplazamiento Longitud: %.2f°%n", desp[1]);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Ubicacion mala = new Ubicacion(200.0, "Norte", 90.0, "Este");
        } catch (LatitudInvalidaException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Ubicacion mala2 = new Ubicacion(45.0, "Sur", 190.0, "Oeste");
        } catch (LongitudInvalidaException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            Ubicacion ub = new Ubicacion(10.0, "Norte", 20.0, "Este");
            ArrayList<String> mesesMalos = new ArrayList<>();
            mesesMalos.add("Verano");
            Observacion obsMala = new Observacion(mesesMalos, ub);
        } catch (MesInvalidoException e) {
            System.out.println("Excepción -> " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}