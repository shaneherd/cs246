
public class HelloWorld {
	String hello = "Hello World";
	
	public void run() {
		System.out.println(hello);
	}
	
	public static void main(String[] args) {
		new HelloWorld().run();
	}
}