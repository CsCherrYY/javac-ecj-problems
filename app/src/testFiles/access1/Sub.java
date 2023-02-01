public class Sub {
    public void testNonStaticOrAlienTypeReceiver() {
        Super a = new SuperImpl();
        a.staticStr();
    }
}
