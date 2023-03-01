public class Magic {
	public static void main(String[] args) {
    // myNumber is the orginal number
    int myNumber = 400;
    // separate variable method
    int stepOne = myNumber * myNumber;
    int stepTwo = stepOne + myNumber;
    int stepThree = stepTwo / myNumber;
    int stepFour = stepThree + 17;
    int stepFive = stepFour - myNumber;
    int stepSix = stepFive / 6;

    System.out.println(stepSix);

    // compound assignment operator method
    int magicNumber = myNumber * myNumber;
    magicNumber += myNumber;
    magicNumber /= myNumber;
    magicNumber += 17;
    magicNumber -= myNumber;
    magicNumber /= 6;

    System.out.println(magicNumber);

    // order of operation method
    int orderOfOperations = ((myNumber * myNumber + myNumber) / myNumber + 17 - myNumber) / 6;

    System.out.println(orderOfOperations);

	}
}