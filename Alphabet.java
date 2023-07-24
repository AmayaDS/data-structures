public class Alphabet {

    Array alphabet = new Array(52);

    public Alphabet(){
        insertChar();
    }

    public void insertChar(){
        int val = 0;

        //lower cases
        for(char c = 97 ; c <= 122 ;c++){
            alphabet.insert(c);
        }

        //upper cases
        for(char c = 65 ; c <= 90 ; c++){
            alphabet.insert(c);
        }

    }

    public int getValue(Character c){
        return alphabet.indexOf(c);
    }


}
