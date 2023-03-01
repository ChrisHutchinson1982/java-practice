public class Review {
  
  public static void main(String[] args) {
    String string1 = "Hello World!";
    String string2 = " I am learning Java.";

    // length() returns length of string
    System.out.println(string1.length());
    // concat() joins strings
    System.out.println(string1.concat(string2));
    //  indexOf() returns the index of a letter or substring
    System.out.println(string1.indexOf("World"));
    //  charAt() retuns char at index
    System.out.println(string1.charAt(0));
    // equals() returns true if equal
    System.out.println(string1.equals("Hello World!"));
    // equalsIgnoreCase() returns true if equal ignoring case
    System.out.println(string1.equalsIgnoreCase("hello world!"));
    // toUpperCase() makes string upppercase
    System.out.println(string1.toUpperCase());
    // toLowerCase() makes string upppercase
    System.out.println(string1.toLowerCase());
  }
  
}