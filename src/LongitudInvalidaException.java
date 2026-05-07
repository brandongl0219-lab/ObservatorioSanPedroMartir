public class LongitudInvalidaException extends Exception {
    public LongitudInvalidaException(double grados) {
        super("Longitud inválida: " + grados + "°. No puede superar 180.");
    }
}