public class MethodReturnsVoid {
    public void testVoidMethod() {

    }

    public String testMethodReturnsVoid() {
        return testVoidMethod();
    }
}