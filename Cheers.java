//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
            String anLetter = "AEFHILMNORSX";  
	    String initialWord = args[0];
            String word = "";
            int times = Integer.parseInt(args[1]);
            String ana = "a";
            for(int i = 0; i < initialWord.length(); i++) {
                 word = word + Character.toUpperCase(initialWord.charAt(i));
                }
               
                
            for(int i = 0; i < word.length(); i++) {
                for(int p = 0; p < 12; p++) {
                        if (word.charAt(i) == anLetter.charAt(p)) {
                                ana = "an"; 
                        }
                }
                System.out.println("Give me " + ana + " " + word.charAt(i) + ": " + word.charAt(i) + "!");
                ana = "a"; 
            }
            System.out.println("What does that spell?");
            for(int p = 0; p < times; p++){
                System.out.println(word + "!!!");
            }
        
        }
}
