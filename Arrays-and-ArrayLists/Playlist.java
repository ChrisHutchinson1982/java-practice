import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    // Created a ArrayList that can hold String values
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    // Add songs to ArrayList
    desertIslandPlaylist.add("Yesterday");
    desertIslandPlaylist.add("Hey Jude");
    desertIslandPlaylist.add("Lady Madonna");
    desertIslandPlaylist.add("Let It Be");
    desertIslandPlaylist.add("Day Tripper");
    desertIslandPlaylist.add("All You Need Is Love");
    // Prints ArrayList to terminal
    System.out.println(desertIslandPlaylist.toString() + "\n");
    // Prints number of songs in ArrayList to terminal
    System.out.println(desertIslandPlaylist.size() + " songs \n");
    // Remove All You Need Is Love song in ArrayList
    desertIslandPlaylist.remove("All You Need Is Love");
    // Prints ArrayList to terminal
    System.out.println(desertIslandPlaylist.toString() + "\n");
    // Switch order of two songs
    String songA = "Hey Jude";
    String songB = "Lady Madonna";
    int indexA = desertIslandPlaylist.indexOf(songA);
    int indexB = desertIslandPlaylist.indexOf(songB);
    desertIslandPlaylist.set(indexB, songA);
    desertIslandPlaylist.set(indexA, songB);
    // Prints ArrayList to terminal
    System.out.println(desertIslandPlaylist.toString() + "\n");
  }
  
}