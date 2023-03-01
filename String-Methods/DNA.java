public class DNA {
  //  Checks if string is dna
 public static String checkForProtein(String dna) {
   int start = dna.indexOf("ATG");
   int stop = dna.indexOf("TGA");

   if(start != -1 && stop != -1 && (stop - start) % 3 == 0) {
     String protein = dna.substring(start, stop+3);
     return "Protein: " + protein;
   } else {
     return "No protein";
   }
 }

 public static void main(String[] args) {
   String dna1 = "ATGCGATACGCTTGA";
   String dna2 = "ATGCGATACGTGA";
   String dna3 = "ATTAATATGTACTGA";

   System.out.println(checkForProtein(dna1)); 
   System.out.println(checkForProtein(dna2));
   System.out.println(checkForProtein(dna3));  
 }
}