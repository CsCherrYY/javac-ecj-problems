import java.util.List;
import java.awt.List;
// package not exist
// javac: compiler.err.doesnt.exist
// ecj: CannotImportPackage
import java.util;
// package exists and type not exist
// javac: compiler.err.cant.resolve.location
// ecj: CannotImportPackage
import java.util.zip;
// package not exist
// javac: compiler.err.doesnt.exist
// ecj: ImportNotFound
import java.NotExist;
// package exists and type not exist
// javac: compiler.err.cant.resolve.location
// ecj: ImportNotFound
import java.util.NotExist;

public class Import {
}