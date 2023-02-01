public class Unresolved {
    private void testUndefinedField() {
        // "compiler.err.cant.resolve"
        String test = this.str;
    }

    private void testUnresolvedVariable() {
        // "compiler.err.cant.resolve.location"
        String test = str;
    }

    private void testUndefinedName() {
        // "compiler.err.cant.resolve.location"
        String test = K.Strin();
    }
}
