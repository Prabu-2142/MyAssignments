package week1.day2;

public class Mobile {
	
	public String mobileBrandName(String m) {
		return m;
	}
	public char mobileLogo(char c) {
		return c;
	}
	public short noOfMobilePiece(short s) {
		return s;
	}
	public int modelNumber(int b) {
		return b;
	}
	public long mobileImeiNumber(long l) {
		return l;
	}
	public float mobilePrice(float f) {
		return f;
	}
	public boolean isDamaged() {
		return false;
	}
	
	public static void main(String[] args) {
		
		Mobile mob= new Mobile();
		
		
		String mobileBrandName = mob.mobileBrandName("Apple");
		char mobileLogo = mob.mobileLogo('A');
		short noOfMobilePiece = mob.noOfMobilePiece((short)100);
		int modelNumber = mob.modelNumber(14);
		long mobileImeiNumber = mob.mobileImeiNumber(12345);
		float mobilePrice = mob.mobilePrice(135000.994567f);
		
		
		System.out.println("Brand name is: "+mobileBrandName);
		System.out.println("Logo: "+mobileLogo);
		System.out.println("Number of mobile available: "+noOfMobilePiece);
		System.out.println("Model Number: "+modelNumber);
		System.out.println("IMEI Number: "+mobileImeiNumber);
		System.out.println("Price: "+mobilePrice);
		System.out.println("Mobile condition damaged/good: "+mob.isDamaged());			
		
	}

}
