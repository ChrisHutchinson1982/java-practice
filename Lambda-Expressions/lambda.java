import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Lambda {

  public static void main(String[] args) {

    // Prints square route for each item using Lambda expression 
    List<Integer> items = new ArrayList<>();
    items.add(1);
    items.add(2);
    items.add(3);
    items.add(4);

    items.forEach(item -> System.out.println(item*item));

    // Prints words from shortest to longest

    String[] words = {"Bye", "Hi", "Adios", "Hola", "Aloha"};
    Arrays.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    System.out.println(Arrays.toString(words));
  }
}