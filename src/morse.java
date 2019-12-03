
import java.util.ArrayList;
import java.util.Scanner;

public class morse {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter message here");
        String letters = userInput.nextLine();
        System.out.println("Enter morse code here");
        String Code = userInput.nextLine();
        letters.toLowerCase();
        Character [] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',' '};
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        morseCode(alpha,morse,letters);
        Words(morse,alpha,Code);
    }
    public static void morseCode(Character[] Words, String[] code, String input) {
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
        public static void Words(String[]code, Character[] Words, String Code){
        String[] array = Code.split(" ");
        String results = " ";
        for(int i =0; i< array.length;i++){
            String Codec = array[i];
        for(int j = 0; j< code.length;j++){
            if(code[j] == Codec){
                results += Words[j];
            }

        }
        for(String output:array){
            System.out.print(results);
        }

        }

        }



    }

