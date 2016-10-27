package demo;

public class DummyBean {
	
	public void talk() {
		System.out.println("i like make things and see people");
	}
	
	public int getTheAnswer() {
		return 42;
	}
	
	public void throwARunTimeException() {
		throw new RuntimeException("throw an exception and run!");
	}
}
