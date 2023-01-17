import java.util.List;
import java.util.ArrayList;

public class TypeMismatch {
    private void testTypeMismatch() {
        // "compiler.err.illegal.initializer.for.type"
        String a = { "a", "b" };
    }

    private void testTypeMismatch1() {
        // "compiler.err.prob.found.req"
        String a = new String[] { "a", "b" };
    }

    private String testReturnTypeMismatch() {
        // "compiler.err.prob.found.req"
        return new String[] { "a", "b" };
    }

    private void testIncompatibleTypesInForeach() {
        List<Integer> intList = new ArrayList<>();
        // "compiler.err.prob.found.req"
        for (String s : intList) {
            s.hashCode();
        }
    }
}
