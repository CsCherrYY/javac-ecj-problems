import java.util.List;

public class Undefined {
    private void testUndefinedMethod() {
        // "compiler.err.cant.resolve.location.args"
        test();
    }

    private void testUndefinedConstructor() {
        // "compiler.err.cant.apply.symbols"
        String l = new String("s", "t");
    }

    private void testUndefinedType() {
        // "compiler.err.cant.resolve.location"
        UndefinedType a = new UndefinedType();
    }
}
