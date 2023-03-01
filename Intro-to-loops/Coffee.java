class Coffee {
  
  public static void main(String[] args) {
    
    // initialize cupsOfCoffee
    int cupsOfCoffee = 1;
    // add while loop with counter
    while(cupsOfCoffee <= 100) {
      System.out.println("Fry drinks cup of coffee #" + cupsOfCoffee);
      cupsOfCoffee++;
    }   
    // refactored to create same output using for loop
    for (int i = 1; i <= 100; i++) {
      System.out.println("Fry drinks cup of coffee #" + i);
    }
    
  }
  
}