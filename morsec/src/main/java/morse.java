
import java.util.ArrayList;
import java.util.Scanner;

public class morse {
       static Character [] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
       static String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter message to be converted to morse code here");
        lettersToMorseCode(alpha,morse,letters);
        
        System.out.println();
        
        String letters = userInput.nextLine();
        System.out.println("Enter morse code to be converted to letters here");
        String Code = userInput.nextLine();
        letters.toLowerCase();
        morseCodeToLetters(morse,alpha,Code);
    }
    public static void lettersToMorseCode(Character[] Words, String[] code, String input) {
        ArrayList<String>converted = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            char Letter =input.charAt(i);

            for (int j = 0; j<Words.length;j++) {
                if (Words[j] == Letter) {
                    converted.add(code[j]);
                }
            }
        }
        for(String list: converted){
            System.out.print(list + " ");
        }
    }
    public static void morseCodeToLetters(String[]code, Character[] Words, String Code){
        String[] array = Code.split(" ");
        String results = "";
        for(int i =0; i < array.length;i++){
            String Codec = array[i];
            for(int j = 0; j < code.length;j++){
                if(code[j].equals(Codec)){
                    results += Words[j];
                }
            }
        }
        System.out.print(results);
    }
}
