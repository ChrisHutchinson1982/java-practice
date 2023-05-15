class Language {

  protected String name;
  protected int numSpeakers;
  protected String regionsSpoken;
  protected String wordOrder;

  Language(String lanName, int lanNumSpeakers, String lanRegionsSpoken, String lanWordOrder) {
    this.name = lanName;
    this.numSpeakers = lanNumSpeakers;
    this.regionsSpoken = lanRegionsSpoken;
    this.wordOrder = lanWordOrder;
  }

  public void getInfo() {

    System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
    System.out.println("The language follows the word order: " + this.wordOrder + ".");
  }

  public static void main(String[] args) {
    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    spanish.getInfo();

    Language mayan = new Mayan("Chontal", 36810);
    mayan.getInfo();

    Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 900000000);
    mandarinChinese.getInfo();

    Language burmese = new SinoTibetan("Burmese", 35000000);
    burmese.getInfo();
  }
}