package javac.ecj.problems;

import javax.tools.Diagnostic;
import javax.tools.DiagnosticListener;
import javax.tools.JavaFileObject;

public class JavacDiagnosticsListener implements DiagnosticListener<JavaFileObject> {
    @Override
    public void report(Diagnostic<? extends JavaFileObject> diagnostic) {
        System.out.println(diagnostic.getCode());
        System.out.println(diagnostic.getMessage(null));
    }
}
