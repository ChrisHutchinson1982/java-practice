class Numbers {
  public static void main(String[] args) {
    for (int i = 0; i < 100; i++) {
      // will only print out i if divisible by 5
      if (i % 5 != 0) {
        continue;
      }
      System.out.println(i);
    }
  }
}