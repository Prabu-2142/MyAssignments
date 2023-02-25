package week1.day2;

public class ConvertNegativeToPositive {

	public static void main(String[] args) {
		
		int num =-56;
		
		if(num<0) {
			System.out.println("The number is Negative: "+num);
			int n=-(num);
			System.out.println("The given number is converted to a positive number: "+n);
		}
		else if(num==0){
			System.out.println("The given number is Neutral number: "+num);
		}
		else {
			System.out.println("The Number is Positive: "+num);
		}
	}

}