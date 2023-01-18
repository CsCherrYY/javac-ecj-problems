public final class FinalClass {
    public void test() {
    }

    public void testAnonymousClassCannotExtendFinalClass() {
        FinalClass a = new FinalClass() {
            public void test() {
            }
        };
    }
}