public class Array {

    private char[] items;
    private int count;

    public Array(int length){
        items = new char[length];
    }


    public void insert(char c){
      items[count] = c;
      count++;
    }

    public void printAll(){
        for(int i = 0 ; i < count ; i++){
            System.out.println(items[i]);
        }
    }

    public int indexOf(char c){
        for(int i = 0 ; i < count ; i++){
            if(items[i] == c){
                return i;
            }
        }
        return -1;
    }

}
