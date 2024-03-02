package spring.HAH.demo.AOP;

public class MessageLoger {
	
	public void BeforeWork() {
		System.out.println("Before Business Method Invocation");
	}
	
	public void AfterWork() {
		System.out.println("After Business Method Invocation");
	}

}
