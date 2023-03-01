public class Dog {
  // instance field
  String name;
  String breed;
  boolean hasOwner;
  int age;

  // constructor method
  public Dog(String dogName, String dogBreed, boolean dogOwned, int dogYears) {
    System.out.println("Constructor invoked!");
    name = dogName;
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
  }
  
  // main method
  public static void main(String[] args) {
    System.out.println("Main method started");
    Dog fido = new Dog("fido", "poodle", false, 4);
    Dog nunzio = new Dog("nunzio", "shiba inu", true, 12);
    Dog bingo = new Dog("bingo", "pug", true, 11);
    boolean isFidoOlderThanNunzio = fido.age > nunzio.age;
    int totalDogYears = nunzio.age + fido.age + bingo.age;
    System.out.println("Three dogs created: a " + fido.breed + ", " + nunzio.breed + " and a " + bingo.breed);
    System.out.println("They are called " + fido.name + ", " + nunzio.name + " and " + bingo.name);
    System.out.println("The statement that " + fido.name + " is an older dog than " + nunzio.name + " is: " + isFidoOlderThanNunzio);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
  }
}