import java.io.FileWriter;

public class LinkedList {

    //node class
    private class Node{
        private String word;
        private int value;
        private Node nextNode;

        public Node(String word,int value){
            this.word = word;
            this.value = value;
        }
    }

    private Node firstNode;
    private Node lastNode;

    // add the node ath the end
    public void add(String word, int value){
        Node node = new Node(word,value);

        if(firstNode == null){
            firstNode = lastNode = node;
        }else{
            lastNode.nextNode = node;
            lastNode = node;
        }
    }

    public void printAll(){
        Node currentNode = firstNode;

        while(currentNode != null){
            System.out.println(currentNode.word+" "+currentNode.value);
            currentNode = currentNode.nextNode;
        }
    }


    // generate wordsHKn.txt file
    public void generateWordsHKnFile(int n){
        try{
            FileWriter file = new FileWriter("C:\\Users\\Chamara\\Desktop\\files\\wordsHK"+n+".txt");

            Node currentNode = firstNode;
            int j = 1;
            while(currentNode != null){
                file.write(j+"\t"+currentNode.word+"\t\t"+currentNode.value+"\n");
                currentNode = currentNode.nextNode;
                j++;
            }

            file.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
