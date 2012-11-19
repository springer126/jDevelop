package test;

public class SqlTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("test.T");
	}

}

class T{
	static{
		System.out.println("---------Class.forName()------------");
	}
}