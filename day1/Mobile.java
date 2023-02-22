package week1.day1;

public class Mobile {

	public void makeCall() {
		
		System.out.println("call initiated");

	}
	public void sendMsg() {
		
		System.out.println("Message sent");
	}
	public static void main(String[] args) {
		
		Mobile m= new Mobile();
		m.makeCall();
		m.sendMsg();

	}

}

