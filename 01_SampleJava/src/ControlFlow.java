
public class ControlFlow {

	public static void main(String[] args) {
		// CTRL+1(code marked)->extract to method = extract to method
		extracted();
	}

	private static void extracted() {
		if(1>2)
			System.out.println("not called");
		else
			System.out.println("called");
	}

}
