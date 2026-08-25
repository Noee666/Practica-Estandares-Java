public class CalculadoraEnvio {

    private static final double UMBRAL_ENVIO_GRATIS = 500.0;
    private static final double TARIFA_FIJA_ENVIO = 99.0;

    public double calcularCostoEnvio(double montoPedido) {
        validarMonto(montoPedido);
        return aplicaEnvioGratis(montoPedido) ? 0.0 : TARIFA_FIJA_ENVIO;
    }

    private void validarMonto(double montoPedido) {
        if (montoPedido < 0) {
            throw new IllegalArgumentException("El monto del pedido no puede ser negativo");
        }
    }

    private boolean aplicaEnvioGratis(double montoPedido) {
        return montoPedido >= UMBRAL_ENVIO_GRATIS;
    }
}