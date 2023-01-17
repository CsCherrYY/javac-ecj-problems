package testFiles;

import testFiles.pkg1.*;
import testFiles.pkg2.*;

public class Ambiguous {
    private void testAmbiguous1() {
        // "compiler.err.ref.ambiguous"
        A a;
    }
}
