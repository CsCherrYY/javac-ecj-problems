public class NonAccessibleReference {

    private String nonStaticField;

    private final String nonStaticFinalField = "final";

    private void nonStaticMethod() {

    }
    public void testStaticMethodRequested() {
        // compiler.err.non-static.cant.be.ref
        NonAccessibleReference.nonStaticMethod();
        // compiler.err.non-static.cant.be.ref
        NonAccessibleReference.nonStaticField = "static-use";
    }

    public void testNonBlankFinalLocalAssignment() {
        final String finalStr = "final";
        // compiler.err.cant.assign.val.to.final.var
        finalStr = "non-final";
    }

    public void testDuplicateFinalLocalInitialization() {
        final String f;
        f = "final";
        f = "non-final";
    }

    public void testFinalFieldAssignment() {
        // compiler.err.cant.assign.val.to.final.var
        this.nonStaticFinalField = "non-final";
    }
}