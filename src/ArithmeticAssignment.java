/**
 * @(#)ArithmeticAssignment.java
 *
 * ArithmeticAssignment application
 *
 * @author 
 * @version 1.00 2015/8/24
 */
 
public class ArithmeticAssignment {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	System.out.println("Hello World!");
    }
}

class Tester {
	public static void main(String[] args) {
		String q1 = "79 + 3 * (4 + 82 - 68) - 7 + 19 = ";
		String q2 = "(179 + 21 + 10) / 7 + 181 = ";
		String q3 = "10389 * 56 * 11 + 2246 = ";

		int q1_a = 79 + 3 * (4 + 82 - 68) - 7 + 19;
		int q2_a = (179 + 21 + 10) / 7 + 181;
		int q3_a = 10389 * 56 * 11 + 2246;

		System.out.println(q1 + q1_a);
		System.out.println(q2 + q2_a);
		System.out.println(q3 + q3_a);
	}
}