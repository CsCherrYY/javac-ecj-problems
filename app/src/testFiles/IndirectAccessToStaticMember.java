public class IndirectAccessToStaticMember {

	public static class Base {
		public static String method() {
			return "hello world";
		}
	}

	public static class Derived extends Base {
		
	}

	public static void main(String[] args) {
		System.out.println(Derived.method()); // Noncompliant
		System.out.println(Base.method()); // Compliant
	}
	
}