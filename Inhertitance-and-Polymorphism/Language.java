import java.util.ArrayList;

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
    ArrayList<Language> languageList = new ArrayList<Language>();

    Language spanish = new Language("Spanish", 555000000, "Spain, Latin America, and Equatorial Guinea", "subject-verb-object");
    Language mayan = new Mayan("Chontal", 36810); 
    Language mandarinChinese = new SinoTibetan("Mandarin Chinese", 900000000);
    Language burmese = new SinoTibetan("Burmese", 35000000);

    languageList.add(spanish);
    languageList.add(mayan);
    languageList.add(mandarinChinese);
    languageList.add(burmese);

    for (Language language : languageList) {
      language.getInfo();
    }
  }
}