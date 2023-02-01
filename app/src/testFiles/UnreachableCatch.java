import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

public class UnreachableCatch {

    public void testUnreachableCatch() {
        // compiler.err.except.never.thrown.in.try
        try {
            String a = "a";
        } catch (IOException e) {

        }
    }

    public void testInvalidCatchBlockSequence() {
        try {
            boolean success = new File("f").createNewFile();
        } catch (IOException e) {

        } catch (FileNotFoundException e) {

        }
    }
}
