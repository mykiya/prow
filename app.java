public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("hello");

		int a = 10;
		// int b = 4;
		int b = 0; // java.lang.ArithmeticException: / by zero
		System.out.println(a / b);

		System.out.println("world");
	}
}
