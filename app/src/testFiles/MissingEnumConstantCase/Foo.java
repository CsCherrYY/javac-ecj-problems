public class Foo {
    public void testMissingEnumConstantCase() {
        Enums e = Enums.A;
        switch(e) {
            case A:
                return;
        }
    }
}