public class LatitudInvalidaException extends Exception {
    public LatitudInvalidaException(double grados) {
        super("Latitud inválida: " + grados + "°. No puede superar 180.");
    }
}