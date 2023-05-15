class SinoTibetan extends Language {
  
  SinoTibetan(String lanName, int lanNumSpeakers) {
    super(lanName, lanNumSpeakers, "Asia", "subject-object-verb");
    if(lanName.contains("Chinese")) {
      this.wordOrder = "subject-verb-object";
    }
  }

}