public class Sub extends Super {
    @Override
    public static void publicMethod() {
        // compiler.err.override.static
        // compiler.err.static.methods.cannot.be.annotated.with.override
    }
}