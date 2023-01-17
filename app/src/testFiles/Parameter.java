public class Parameter {

    private String message;

    private void setMessage(String message) {
        this.message = message;
    }

    private void testMethodParameter1() {
        // "compiler.err.cant.apply.symbol"
        this.setMessage();
    }
}
