public class MesInvalidoException extends Exception {
    public MesInvalidoException(String mes) {
        super("Mes inválido: " + mes + ". Debe ser un mes del año.");
    }
}