public class Unresolved {
    private void testUndefinedField() {
        String test = this.str;
    }

    private void testUndefinedVariable() {
        String test = str;
    }

    private void testUndefinedName() {
        String test = K.Strin();
    }
}
