public class Access {
    private static String staticStr = "static";

    private static void staticMethod() {

    }

    public void testNonStaticAccessToStaticField() {
        this.staticStr = "str";
    }

    public void testNonStaticAccessToStaticMethod() {
        this.staticMethod();
    }
}
