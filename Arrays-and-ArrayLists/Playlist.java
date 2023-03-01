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
  }
  
}