public class Unused {

    private String unusedField;
    private Unused(String unusedField) {
        this.unusedField = unusedField;
    }

    private void unusedPrivateMethod() {

    }

    private void LocalVariableIsNeverUsed() {
        String i = "i";
    }

    private static class PrivateType {
        // intellij: private.inner.class.is.not.used
    }
}
