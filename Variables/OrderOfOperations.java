public class OrderOfOperations {
	public static void main(String[] args) { 

    /* 
    Order of operations follows:

    1. Parentheses
    2. Exponents
    3. Modulo/Multiplication/Division
    4.  Addition/Subtraction
    */

    int expression1 = 5 % 2 - (4 * 2 - 1);
    // outputs -6
    System.out.println(expression1);

    int expression2 = (3 + (2 * 2 - 5)) + 6 - 5;
    // outputs 3
    System.out.println(expression2);

    int expression3 = 5 * 4 % 3 - 2 + 1;
    // outputs 1
    System.out.println(expression3);

	}
}