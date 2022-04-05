package com.company.java.innerouter.nested;

public interface Showable {
	void show();
	
	interface Message {
		void msg();
	}

}

class TestNestedInterface1 implements Showable.Message {

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		
		System.out.println("Hello nested interface");
		
	}
	
	public static void main(String[] args) {
		
		Showable.Message message = new TestNestedInterface1(); // Upcasting
		message.msg();
		
	}
	
	
	
}
