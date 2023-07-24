
import java.io.File;
import java.util.Scanner;

public class DSA {
    public static void main(String[] args) {

        Alphabet alphabet = new Alphabet();
        LinkedList wordList = new LinkedList();

        try{
            int n = 7;
            File inputFile = new File("C:\\Users\\Chamara\\Desktop\\files\\file"+n+".txt");
            Scanner file = new Scanner(inputFile);

            while(file.hasNext()){
                String word = file.next();
                String validWord = "";
                int wordValue = 0;

                for(int i = 0 ; i < word.length() ; i++){
                    if(word.charAt(i) >= 65 && word.charAt(i) <=90 || word.charAt(i) >= 97 && word.charAt(i) <= 122 ){
                        validWord = validWord + word.charAt(i);
                        wordValue = wordValue + alphabet.getValue(word.charAt(i));
                    }
                }

                if(validWord.length() > 0){
                    wordList.add(validWord,wordValue);
                }
            }

            // create wordsHKn.txt file
            wordList.generateWordsHKnFile(n);

        }catch(Exception e){
            e.printStackTrace();
        }



    }
}
