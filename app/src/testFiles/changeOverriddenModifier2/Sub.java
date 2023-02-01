public class Sub extends Super {
    @Override
    public void privateMethod() {
        // compiler.err.method.does.not.override.superclass
    }

    @Override
    public void finalMethod() {
        // compiler.err.override.meth
    }

    @Override
    public void staticMethod() {
        // compiler.err.override.meth, compiler.err.method.does.not.override.superclass
    }
}